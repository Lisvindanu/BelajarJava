package TugasKelompok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class FileNasabah extends JFrame {
    private JTextField norekField;
    private JTextField namaField;
    private JTextField saldoField;
    private JButton saveButton;
    private JButton readButton;
    private JButton updateButton;
    private JComboBox<String> userComboBox;
    private ArrayList<Nasabah> nasabahList; // Menyimpan data Tubes.Nasabah

    public FileNasabah() {
        initializeUI();
        nasabahList = new ArrayList<>(); // Inisialisasi ArrayList untuk data Tubes.Nasabah
    }

    private void initializeUI() {
        setTitle("Aplikasi Tubes.Nasabah");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        JLabel norekLabel = new JLabel("Norek:");
        JLabel namaLabel = new JLabel("Nama:");
        JLabel saldoLabel = new JLabel("Saldo:");

        norekField = new JTextField();
        namaField = new JTextField();
        saldoField = new JTextField();

        saveButton = new JButton("Simpan");
        readButton = new JButton("Baca");
        updateButton = new JButton("Perbarui");

        userComboBox = new JComboBox<>();

        add(norekLabel);
        add(norekField);
        add(namaLabel);
        add(namaField);
        add(saldoLabel);
        add(saldoField);
        add(saveButton);
        add(readButton);
        add(updateButton);
        add(userComboBox);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });

        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readData();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateData();
            }
        });

        setVisible(true);
    }

    private void saveData() {
        // Mengambil data dari input
        int Norek = Integer.parseInt(norekField.getText());
        String Nama = namaField.getText();
        double Saldo = Double.parseDouble(saldoField.getText());

        try {
            ArrayList<Nasabah> existingData = readExistingData();

            // Cari objek yang sesuai berdasarkan norek
            for (Nasabah nasabah : existingData) {
                if (nasabah.getNorek() == Norek) {
                    // Perbarui data yang sesuai
                    nasabah.setNama(Nama);
                    nasabah.setSaldo(Saldo);
                    break;
                }
            }

            // Simpan kembali semua data
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tubes.Nasabah.dat"));
            for (Nasabah nasabah : existingData) {
                out.writeObject(nasabah);
            }
            out.close();
            JOptionPane.showMessageDialog(this, "Data tersimpan.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private ArrayList<Nasabah> readExistingData() {
        ArrayList<Nasabah> existingData = new ArrayList<>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Tubes.Nasabah.dat"));
            Object obj;
            while ((obj = in.readObject()) != null) {
                if (obj instanceof Nasabah) {
                    existingData.add((Nasabah) obj);
                }
            }
            in.close();
        } catch (EOFException ignored) {
            // Akhir dari file, abaikan exception
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return existingData;
    }

    private void readData() {
        nasabahList.clear();
        nasabahList = readExistingData();
        for (Nasabah nasabah : nasabahList) {
            System.out.println("Norek : " + nasabah.getNorek());
            System.out.println("Nama : " + nasabah.getNama());
            System.out.println("Saldo : " + nasabah.getSaldo());
        }
        showUpdateOptions();
    }

    private void updateData() {
        int selectedIndex = userComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            Nasabah selectedNasabah = nasabahList.get(selectedIndex);
            String selectedUser = selectedNasabah.getNama();

            // Panggil GUI perubahan data untuk objek yang dipilih
            SwingUtilities.invokeLater(() -> new UpdateDataGUI(selectedNasabah));
        } else {
            JOptionPane.showMessageDialog(this, "Pilih pengguna untuk diperbarui.");
        }
    }

    private void showUpdateOptions() {
        userComboBox.removeAllItems();
        for (Nasabah nasabah : nasabahList) {
            userComboBox.addItem(nasabah.getNama());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileNasabah();
            }
        });
    }
}