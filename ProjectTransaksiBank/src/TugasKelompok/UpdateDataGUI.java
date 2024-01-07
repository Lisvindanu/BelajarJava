package TugasKelompok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class UpdateDataGUI extends JFrame {
    private Nasabah selectedNasabah;
    private JTextField newSaldoField;
    private JButton saveButton;

    public UpdateDataGUI(Nasabah selectedNasabah) {
        this.selectedNasabah = selectedNasabah;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Update Data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Nama: " + selectedNasabah.getNama());
        JLabel saldoLabel = new JLabel("Saldo:");
        newSaldoField = new JTextField(15);
        saveButton = new JButton("Simpan");

        add(nameLabel);
        add(saldoLabel);
        add(newSaldoField);
        add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateSaldo();
            }
        });

        setVisible(true);
    }

    private void updateSaldo() {
        double newSaldo = Double.parseDouble(newSaldoField.getText());
        selectedNasabah.setSaldo(newSaldo);

        // Simpan kembali data ke file setelah diperbarui
        saveUpdatedNasabah();
        JOptionPane.showMessageDialog(null, "Data untuk " + selectedNasabah.getNama() + " diperbarui dengan saldo baru: " + newSaldo);
        dispose(); // Tutup GUI setelah memperbarui data
    }

    private void saveUpdatedNasabah() {
        // Lakukan logika untuk menulis kembali data yang diperbarui ke file
        // Gunakan ObjectOutputStream untuk menulis objek ke file
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tubes.Nasabah.dat"));
            out.writeObject(selectedNasabah);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
