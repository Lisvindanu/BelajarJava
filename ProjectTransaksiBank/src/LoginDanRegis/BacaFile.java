package LoginDanRegis;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class BacaFile {
    public static void main(String[] args) {
        String LokasiFile = "D:\\LearnJava\\ProjectTransaksiBank\\loginInfo.dat";

        try {
            FileInputStream fileInputStream = new FileInputStream(LokasiFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            HashMap<String, Integer> loginInfo = (HashMap<String, Integer>) objectInputStream.readObject();

            for (String key : loginInfo.keySet()) {
                System.out.println("User id : " + key + " - Password : " + loginInfo.get(key));
            }
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
