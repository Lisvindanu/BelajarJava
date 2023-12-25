import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CekUmurGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cek Umur GUI");

        JLabel nameLabel = new JLabel("Nama:");
        JTextField nameField = new JTextField(20);

        JLabel umurLabel = new JLabel("Umur:");
        JTextField umurField = new JTextField(5);

        JButton submitButton = new JButton("Submit");

        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = nameField.getText();
                int umur = Integer.parseInt(umurField.getText());
                String hasil = (umur < 18) ? "Cih bocil" : "Anjay gede";
                resultArea.setText("Nama: " + nama + "\nUmur: " + umur + "\nRostingGwe: " + hasil);

                // Tampilkan video Rickroll dari menit 1:43 di browser default setelah 5 detik
                Timer timer = new Timer(500, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ&t=103s"));
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                timer.setRepeats(false); // Hanya dijalankan sekali setelah 5 detik
                timer.start(); // Mulai hitung waktu
            }
        });

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(umurLabel);
        panel.add(umurField);
        panel.add(submitButton);
        panel.add(resultArea);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
