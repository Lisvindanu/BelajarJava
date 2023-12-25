package Arsip;
import java.io.*;
import java.util.Scanner;

public class
FileMhs implements Serializable {
    void SafeFileMhs(){
        Mahasiswa mhs = new Mahasiswa();
        int no;
        String nama;
        float ip;
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Arsip.dat" + ""));
            for (int i=1; i<=3; i++){
                mhs = new Mahasiswa(0, null, 0);
                Scanner sc = new Scanner(System.in);
                System.out.println("Pengisian data  ");
                System.out.print("Nim : "); no=sc.nextInt(); sc.nextLine();
                System.out.print("Nama : "); nama=sc.nextLine();
                System.out.print("Ip : "); ip=sc.nextFloat();
                mhs=new Mahasiswa(no,nama,ip);
                out.writeObject(mhs);
            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void SafeFileMhs2(){
        Mahasiswa mhs = new Mahasiswa();
        int no;
        String nama;
        float ip;
        ObjectOutputStream out = null;
        try {
            Scanner sc = new Scanner(System.in);
            out = new ObjectOutputStream(new FileOutputStream("Arsip.dat" + ""));
            System.out.println("nim: "); no = sc.nextInt();
            while(no !=999){
                sc.nextLine();
                System.out.print("Nama : "); nama=sc.nextLine();
                System.out.print("Ip : "); ip=sc.nextFloat();
                mhs=new Mahasiswa(no,nama,ip);
                out.writeObject(mhs);
                System.out.println("nim: "); no=sc.nextInt();
            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void BacaFile() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Arsip.dat"));

            while (true) {
                try {
                    Mahasiswa mhs = (Mahasiswa) in.readObject();
                    // Lakukan apa pun yang perlu Anda lakukan dengan objek Mahasiswa yang telah dibaca
                    mhs.GetMhs(); // Contoh untuk menampilkan informasi mahasiswa

                } catch (EOFException e) {
                    break; // Akhiri loop saat sudah selesai membaca file
                }
            }

            in.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        FileMhs f = new FileMhs();
//    f.SafeFileMhs2();
  f.BacaFile();

    }
}


