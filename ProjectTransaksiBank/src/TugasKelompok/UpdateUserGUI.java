package TugasKelompok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UpdateUserGUI extends JFrame {
    private JComboBox<String> userComboBox;
    private JButton updateDataButton;
    private ArrayList<Nasabah> nasabahList;

    public UpdateUserGUI(ArrayList<Nasabah> userList) {
        this.nasabahList = userList;
        initializeUI();
        showUsersInComboBox();
    }

    private void initializeUI() {
        setTitle("Update User Data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        userComboBox = new JComboBox<>();
        updateDataButton = new JButton("Update Data");

        add(userComboBox);
        add(updateDataButton);

        updateDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDataForSelectedUser();
            }
        });

        setVisible(true);
    }

    private void showUsersInComboBox() {
        for (Nasabah nasabah : nasabahList) {
            userComboBox.addItem(nasabah.getNama());
        }
    }

    private void updateDataForSelectedUser() {
        int selectedIndex = userComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            Nasabah selectedNasabah = nasabahList.get(selectedIndex);
            new UpdateDataGUI(selectedNasabah); // Passing Tubes.Nasabah object directly
            dispose(); // Close the current GUI
        } else {
            JOptionPane.showMessageDialog(this, "Pilih pengguna untuk diperbarui.");
        }
    }
}
