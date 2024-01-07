package Tubes.services;

import Tubes.Nasabah;
import Tubes.util.InputUtil;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileNasabahServiceImpl implements FileNasabahService {

    @Override
    public void showMenu() {

        System.out.println("Menu : ");
        System.out.println("1. Simpan Data : ");
        System.out.println("2. Baca File Nasabah : ");
        System.out.println("3. Update File : ");
        System.out.println("4. Tambah Record : ");
        System.out.println("5. Hapus Record : ");
        System.out.println("x. Keluar");
    }

    @Override
    public void saveToFile() throws IOException {
        Nasabah Record = new Nasabah();
        System.out.println("==========SAVE TO FILE==========");
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            Record.setNorek(InputUtil.inputInt("Norek"));
            while (Record.getNorek() != 999) {
              Record.setPin(InputUtil.inputInt("Pin"));
              Record.setNama(InputUtil.inputString("Nama"));
              Record.setSaldo(InputUtil.inputDouble("Saldo"));
              out.writeObject(Record);
              Record.setNorek(InputUtil.inputInt("Norek"));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out != null ){
                out.close();
            }
        }
    }

    @Override
    public void bacaFileNasabah() throws IOException {
        System.out.println("==========Reading File==========");
        ObjectInputStream in = null;
        Nasabah Record = new Nasabah();
        int total = 0;
        try{
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            Object currentRecord = in.readObject();
            try{
                while (true) {
                    Record = (Nasabah) currentRecord;
                    System.out.println("Norek : " + Record.getNorek());
                    System.out.println("Pin : " + Record.getPin());
                    System.out.println("Nama : " + Record.getNama());
                    System.out.println("Saldo : " + Record.getSaldo());
                    total++;
                    currentRecord = in.readObject();
                }
            } catch (EOFException e) {
                System.out.println("Total Record " + total);
            } catch (ClassNotFoundException e) {
                System.out.println("Class not Found!");
            }catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            throw  new RuntimeException(e);
        }

    }

    @Override
    public void updateData() {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah Record;
            int total = 0;

            System.out.println("==========Tahap 1==========");
            System.out.println("Norek cari: ");
            Integer NorekCari = InputUtil.inputInt("");
            System.out.println("Pin Baru: ");
            Integer PinBaru = InputUtil.inputInt("");

            try {
                while (true) {
                    Record = (Nasabah) in.readObject();
                    if (Record.getNorek().equals(NorekCari)) {
                        Record.setPin(PinBaru);
                    }
                    out.writeObject(Record);
                    total++;
                }
            } catch (EOFException e) {
                System.out.println("Total Record " + total);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            int total = 0;
            Nasabah Record;

            System.out.println("==========Tahap 2==========");
            try {
                while (true) {
                    Record = (Nasabah) in.readObject();
                    out.writeObject(Record);
                    total++;
                }
            } catch (EOFException e) {
                System.out.println("Total record " + total);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void menu1() throws IOException {
        System.out.println("Menu : ");
        System.out.println("1. Cek Saldo : ");
        System.out.println("x. Keluar ");
    }

    @Override
    public void tambahRecord() throws IOException {
        System.out.println("========== Tahap 1 ==========");
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        int total = 0;
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat" + ""));
            Object currentRecord = in.readObject();
            try {
                while (currentRecord != null) {  // Ubah kondisi looping untuk penanganan EOF
                    Nasabah Record = (Nasabah) currentRecord;
                    out.writeObject(Record);
                    total++;
                    currentRecord = in.readObject();
                }
            } catch (EOFException e) {
                System.out.println("Total Record " + total);
            }

            // Pastikan penulisan data yang ditambahkan
            Nasabah newRecord = new Nasabah();
            newRecord.setNorek(InputUtil.inputInt("Norek"));
            newRecord.setPin(InputUtil.inputInt("Pin"));
            newRecord.setNama(InputUtil.inputString("Nama"));
            newRecord.setSaldo(InputUtil.inputDouble("Saldo"));
            out.writeObject(newRecord);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                out.close();  // Pastikan ObjectOutputStream ditutup
            }
        }

        System.out.println("========== Tahap 2 ==========");

        try {
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
            out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));

            Nasabah record;
            while ((record = (Nasabah) in.readObject()) != null) {
                out.writeObject(record);
                total++;
            }
        } catch (EOFException e) {
            System.out.println("Total record " + total);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();  // Tutup ObjectInputStream di tahap kedua
            }
            if (out != null) {
                out.close();  // Tutup ObjectOutputStream di tahap kedua
            }
        }
    }


    @Override
    public void hapusRecord() throws IOException {
        System.out.println("========= TAHAP 1 ==========");
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        int total = 0;
        String namaToDelete = InputUtil.inputString("Nama");
        try{
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
            try{
                while (true) {
                    Nasabah Record = (Nasabah) in.readObject();
                    if (!Record.getNama().equals(namaToDelete)) {
                        out.writeObject(Record);
                        total++;
                    }
                }
            } catch (EOFException e) {
                System.out.println("Total record " + total);
                out.close();
            } catch (ClassNotFoundException e) {
                System.out.println("Class Not Found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Tahap 2");
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
            out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            try{
                while (true) {
                    Nasabah Record = (Nasabah) in.readObject();
                    out.writeObject(Record);
                    total++;
                }
            }catch (EOFException e) {
                System.out.println("Total record " + total);
                out.close();
            } catch (ClassNotFoundException e) {
                System.out.println("Class not Found!");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in.close(); // Menutup ObjectInputStream
                out.close(); // Menutup ObjectOutputStream di tahap kedua
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void cekSaldo(String username) throws IOException {
        System.out.println("==========Reading File==========");
        ObjectInputStream in = null;
        Nasabah Record;
        int total = 0;
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            Object currentRecord = in.readObject();
            try {
                while (currentRecord != null) {
                    Record = (Nasabah) currentRecord;
                    if (Record.getNama().equals(username)) {
                        System.out.println("Hai "+  Record.getNama() + " "  + "Saldo Kamu : " + Record.getSaldo());
                        total++;
                    }
                    currentRecord = in.readObject();
                }
                System.out.println("Total Record " + total);
            } catch (ClassNotFoundException e) {
                System.out.println("Class not Found!");
            }
        } catch (EOFException e) {
            System.out.println("Total Record " + total);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
