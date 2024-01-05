package BelajarBroCode;

import javax.swing.*;
import java.awt.*;

public class Welcome {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hallo");

    Welcome(String userId){
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        welcomeLabel.setText("Hello "+ userId);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
