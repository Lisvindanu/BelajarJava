package LoginDanRegis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    import java.io.*;
import java.util.HashMap;

public class RegisterPage {
private JFrame frame = new JFrame();
private JButton tombolDaftar = new JButton("Daftar");
private JTextField userIdField = new JTextField();
private JPasswordField userPasswordField = new JPasswordField();
private JLabel HeaderRegister = new JLabel("Register Page");
private  JLabel userIdLabel = new JLabel("User ID : ");
private  JLabel userPasswordLabel = new JLabel("Password : ");
private  JLabel pesanLabel = new JLabel();

private HashMap<String,Integer> logininfo = new HashMap<>();

public RegisterPage(){
    initializeUI();
    setupAction();
}

public void initializeUI(){
   HeaderRegister.setBounds(155, 60, 125, 25);
    HeaderRegister.setFont(new Font("Arial", Font.BOLD, 18));
    HeaderRegister.setForeground(Color.BLACK);

    userIdLabel.setBounds(50,100,75,25);
    userPasswordLabel.setBounds(50,150,75,25);

    userIdField.setBounds(125,100,200,25);
    userPasswordField.setBounds(125,150,200,25);

    tombolDaftar.setBounds(125,200,100,25);
    tombolDaftar.setFocusable(false);

    pesanLabel.setBounds(125,250,250,35);
    pesanLabel.setFont(new Font(null, Font.ITALIC, 14));

    frame.add(HeaderRegister);
    frame.add(userIdLabel);
    frame.add(userPasswordLabel);
    frame.add(pesanLabel);
    frame.add(userIdField);
    frame.add(userPasswordField);
    frame.add(tombolDaftar);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setLayout(null);
    frame.setVisible(true);
}
private void  setupAction(){
    tombolDaftar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userId = userIdField.getText();
            char[] passwordChars = userPasswordField.getPassword();
            String passwordString = new String(passwordChars);
            Integer password = null;

            if(passwordString.length() !=6) {
                pesanLabel.setForeground(Color.red);
                pesanLabel.setText("Password harus 6 angka!");
                return;
            }

            try {
                if(!passwordString.isEmpty()) {
                    password = Integer.parseInt(passwordString);
                } else  {
                    throw new NumberFormatException();
                }
            }catch (NumberFormatException exception) {
                exception.printStackTrace();
                pesanLabel.setForeground(Color.RED);
                pesanLabel.setText("Password harus berupa angka");
                return;
            }

            saveLoginInfo(logininfo);

            if(!userId.isEmpty() && password != 0) {
               if(logininfo.containsKey(userId)) {
                   pesanLabel.setForeground(Color.red);
                   pesanLabel.setText("User Id sudah Terdaftar!");
               } else {
                   logininfo.put(userId, password);
                   saveLoginInfo(logininfo);

                   pesanLabel.setForeground(Color.black);
                   pesanLabel.setText("Berhasil Mendaftar!");
               }


                frame.dispose();

                LoginPage loginPage = new LoginPage();
                loginPage.setLoginInfo(logininfo);
            } else {
                pesanLabel.setForeground(Color.RED);
                pesanLabel.setText("Masukkan User Id dan Password !!!");
            }
        }
    });
}

private void saveLoginInfo(HashMap<String ,Integer> logininfoBaru){
    HashMap<String, Integer> DataLama = readLoginInfoFromFile();

   for(String userId : logininfoBaru.keySet()) {
       DataLama.put(userId, logininfoBaru.get(userId));
    }
    try {
        FileOutputStream fileOutputStream = new FileOutputStream("loginInfo.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(DataLama);
        objectOutputStream.close();
        fileOutputStream.close();
    }catch (IOException e){
        e.printStackTrace();
    }
}

private HashMap<String, Integer> readLoginInfoFromFile(){
    HashMap<String, Integer> loginInfoFromFile = new HashMap<>();

    try {
        FileInputStream fileInputStream = new FileInputStream("loginInfo.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream((fileInputStream));

        loginInfoFromFile = (HashMap<String, Integer>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
    }catch (IOException | ClassNotFoundException e){
        e.printStackTrace();
    }
    return loginInfoFromFile;
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterPage();
            }
        });
    }
}
