import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FrameApp extends JFrame {
    private JPanel panel;
    private JButton button;

    public FrameApp() {
        setTitle("Jendela apps");
        setSize(600, 400);

        // Membuat panel
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Ini adalah Label.");
        JLabel textlabel1 = new JLabel("Ini adalah text di bawah Label.");

        // Membuat tombol
        button = new JButton("Klik Saya");

        // Menambahkan aksi (action) pada tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Memuat gambar latar belakang
                    Image backgroundImage = ImageIO.read(new File("D:\LearnJava\Jframe\src\Hantu.jpg"));



                    // Membuat label dengan gambar latar belakang
                    JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));

                    // Mengatur latar belakang panel sebagai transparan
                    panel.setOpaque(false);

                    // Menghapus komponen yang ada di panel
                    panel.removeAll();

                    // Menambahkan label latar belakang ke panel
                    panel.add(backgroundLabel);

                    // Menambahkan komponen-komponen ke dalam panel
                    panel.add(label);
                    panel.add(textlabel1);
                    panel.add(button);

                    // Memuat ulang panel
                    panel.revalidate();
                    panel.repaint();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Menambahkan komponen-komponen ke dalam panel
        panel.add(label);
        panel.add(textlabel1);
        panel.add(button);

        // Menambahkan panel ke dalam frame
        add(panel);
    }

    public static void main(String[] args) {
        BelajarSwing.FrameApp fApp = new BelajarSwing.FrameApp();
        fApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fApp.setVisible(true);
    }
}
