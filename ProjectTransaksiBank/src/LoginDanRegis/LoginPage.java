    package LoginDanRegis;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.util.HashMap;

    public class LoginPage {
        private JFrame frame = new JFrame();
        private JButton tombolLogin = new JButton("Tubes.Login");

       private JLabel HeaderGUI = new JLabel("Tubes.Login");
        private JTextField userIdField = new JTextField();
        private JPasswordField userPasswordField = new JPasswordField();
        private JLabel userIdLabel = new JLabel("User Id: ");
        private JLabel passwordLabel = new JLabel("Password: ");
        private JLabel pesanLabel = new JLabel();

        private HashMap<String,Integer> logininfo = new HashMap<>();

        public  LoginPage() {
            initializeUI();
            setupAction();

        }

        private void initializeUI(){

            HeaderGUI.setBounds(175, 60, 75, 25);
            HeaderGUI.setFont(new Font("Arial", Font.BOLD, 18));
            HeaderGUI.setForeground(Color.BLACK);

            userIdLabel.setBounds(50, 100, 75, 25);
           passwordLabel.setBounds(50, 150, 75, 25);

            userIdField.setBounds(125,100,200,25);
            userPasswordField.setBounds(125,150,200,25);

            tombolLogin.setBounds(155,200,100,25);
            tombolLogin.setFocusable(false);

            pesanLabel.setBounds(50,250,550,35);
            pesanLabel.setFont(new Font(null, Font.ITALIC, 14));


            frame.add(HeaderGUI);
            frame.add(userIdLabel);
            frame.add(passwordLabel);
            frame.add(pesanLabel);
            frame.add(userIdField);
            frame.add(userPasswordField);
            frame.add(tombolLogin);


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);

            logininfo = readLoginInfoFromFile();
        }

        public void setLoginInfo(HashMap<String, Integer> logininfo) {
            this.logininfo = logininfo;
        }
        private void setupAction() {
            tombolLogin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userId = userIdField.getText();
                    String passwordString = String.valueOf(userPasswordField.getPassword());

                    if(passwordString.length() !=6) {
                        pesanLabel.setForeground(Color.red);
                        pesanLabel.setText("Password harus 6 angka!");
                        return;
                    }

                    if (!userId.isEmpty() && !passwordString.isEmpty()) {
                        Integer password = Integer.parseInt(passwordString);

                        if (logininfo.containsKey(userId) && logininfo.get(userId).equals(password)) {
                            pesanLabel.setForeground(Color.black);
                            pesanLabel.setText("Tubes.Login Sukses");
                        } else {
                            pesanLabel.setForeground(Color.RED);
                            pesanLabel.setText("User Id atau Password Salah.");
                        }
                    } else {
                        pesanLabel.setForeground(Color.RED);
                        pesanLabel.setText("Tolong Masukkan User Id dan Password.");
                    }
                }
            });
        }
        private HashMap<String,Integer> readLoginInfoFromFile(){
            HashMap<String,Integer> loginInfoFromFile = new HashMap<>();

            try {
                FileInputStream fileInputStream = new FileInputStream("loginInfo.dat");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                loginInfoFromFile = (HashMap<String, Integer>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            return  loginInfoFromFile;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new LoginPage();
                }
            });
        }


    }
