

package Tubes.services;

import Tubes.Nasabah;
import Tubes.util.InputUtil;

import java.io.*;

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
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
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
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            Object currentRecord = in.readObject();
            try {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
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
        System.out.println("2. Transfer : ");
        System.out.println("3. Ubah Pin: ");
        System.out.println("4. Tarik Tunai: ");
        System.out.println("5. Setor Tunai: ");
        System.out.println("6. Top Up E-Wallet: ");
        System.out.println("7. Bayar Token Listrik: ");
        System.out.println("8. Bayar PDAM: ");
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
        try {
            in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
            out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
            try {
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
            try {
                while (true) {
                    Nasabah Record = (Nasabah) in.readObject();
                    out.writeObject(Record);
                    total++;
                }
            } catch (EOFException e) {
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
                        System.out.println("Hai " + Record.getNama() + " " + "Saldo Kamu : " + Record.getSaldo());
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

    @Override
    public void transfer(String pengirim, String penerima, Double jumlahTransfer, Integer pinPengirim) throws IOException {


        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            boolean pengirimDitemukan = false;
            boolean penerimaDitemukan = false;

            while (true) {
                try {
                    Nasabah nasabah = (Nasabah) in.readObject();

                    if (nasabah.getNama().equals(pengirim)) {
                        pengirimDitemukan = true;

                        if (!nasabah.getPin().equals(pinPengirim)) {
                            System.out.println("PIN yang dimasukkan salah untuk pengirim.");
                            return;
                        }

                        double saldoPengirim = nasabah.getSaldo();
                        if (saldoPengirim >= jumlahTransfer) {
                            nasabah.setSaldo(saldoPengirim - jumlahTransfer);
                        } else {
                            System.out.println("Saldo tidak mencukupi untuk pengirim.");
                            return;
                        }
                    }

                    if (nasabah.getNama().equals(penerima)) {
                        penerimaDitemukan = true;
                        double saldoPenerima = nasabah.getSaldo();
                        nasabah.setSaldo(saldoPenerima + jumlahTransfer);
                    }

                    out.writeObject(nasabah);
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            if (!pengirimDitemukan || !penerimaDitemukan) {
                System.out.println("Pengirim atau penerima tidak ditemukan.");
                return;
            }
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            while (true) {
                try {
                    Object currentRecord = in.readObject();
                    if (currentRecord != null) {
                        out.writeObject(currentRecord);
                    } else {
                        break;
                    }
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void tariktunai() throws IOException {

    }

    @Override
    public void ubahPin(String username, Integer newPin) throws IOException {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Java-Alpro2\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Java-Alpro2\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            while (true) {
                try {
                    Nasabah nasabah = (Nasabah) in.readObject();

                    if (nasabah.getNama().equals(username)) {
                        nasabah.setPin(newPin);
                        System.out.println("PIN berhasil diubah.");
                    }

                    out.writeObject(nasabah);
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Java-Alpro2\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Java-Alpro2\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            while (true) {
                try {
                    Object currentRecord = in.readObject();
                    if (currentRecord != null) {
                        out.writeObject(currentRecord);
                    } else {
                        break;
                    }
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void updatePin(String username, Integer newPin) {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                if (nasabah.getNama().equals(username)) {
                    nasabah.setPin(newPin);
                }
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Double tarikTunai(String username, Double jumlah) {
        Double saldoBaru = null;
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                if (nasabah.getNama().equals(username)) {
                    if (nasabah.getSaldo() >= jumlah) {
                        saldoBaru = nasabah.getSaldo() - jumlah;
                        nasabah.setSaldo(saldoBaru);
                    } else {
                        System.out.println("Saldo Anda tidak cukup.");
                        return null;
                    }
                }
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return saldoBaru;
    }
    @Override
    public void setorTunai(String username, Double jumlah) {
        if (jumlah < 50000) {
            System.out.println("Maaf, jumlah setoran minimal adalah 50000.");
            return;
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                if (nasabah.getNama().equals(username)) {
                    Double saldoBaru = nasabah.getSaldo() + jumlah;
                    nasabah.setSaldo(saldoBaru);
                    System.out.println("Proses berhasil. Saldo Anda sekarang adalah: " + saldoBaru);
                }
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void topUpEwallet(String username, String noEwallet, Double jumlah, int pin) {
        // Cek apakah jumlah top up kurang dari 10000
        if (jumlah < 10000) {
            System.out.println("Pembayaran gagal, jumlah minimal top up e-wallet adalah 10000.");
            return;
        }

        // Baca objek Nasabah dari file
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                // Jika username cocok, kurangi jumlah dari saldo
                if (nasabah.getNama().equals(username)) {
                    if (nasabah.getSaldo() >= jumlah) {
                        Double saldoBaru = nasabah.getSaldo() - jumlah;
                        nasabah.setSaldo(saldoBaru);
                        System.out.println("Pembayaran berhasil. Saldo Anda sekarang adalah " + saldoBaru);
                    } else {
                        System.out.println("Saldo Anda tidak cukup.");
                        return;
                    }
                }
                // Tulis objek Nasabah (diperbarui atau tidak) ke file sementara
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Salin isi file sementara kembali ke file asli
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void bayarTokenListrik(String username, String noMeter, String noHp, Double jumlah, int pin) {
        // Cek apakah jumlah pembayaran kurang dari 20000
        if (jumlah < 20000) {
            System.out.println("Pembayaran gagal, jumlah minimal pembayaran token listrik adalah 20000.");
            return;
        }

        // Baca objek Nasabah dari file
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                // Jika username cocok, kurangi jumlah dari saldo
                if (nasabah.getNama().equals(username)) {
                    if (nasabah.getSaldo() >= jumlah) {
                        Double saldoBaru = nasabah.getSaldo() - jumlah;
                        nasabah.setSaldo(saldoBaru);
                        System.out.println("Pembayaran berhasil. Token akan dikirim ke nomor HP " + noHp + "sisa saldo anda adalah" +saldoBaru);
                    } else {
                        System.out.println("Saldo Anda tidak cukup.");
                        return;
                    }
                }
                // Tulis objek Nasabah (diperbarui atau tidak) ke file sementara
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Salin isi file sementara kembali ke file asli
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void bayarPDAM(String username, String noPelanggan, String namaPemilik, Double jumlah, int pin) {
        // Baca objek Nasabah dari file
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                // Jika username cocok, kurangi jumlah dari saldo
                if (nasabah.getNama().equals(username)) {
                    if (nasabah.getSaldo() >= jumlah) {
                        Double saldoBaru = nasabah.getSaldo() - jumlah;
                        nasabah.setSaldo(saldoBaru);
                        System.out.println("Pembayaran berhasil. Saldo Anda sekarang adalah " + saldoBaru);
                    } else {
                        System.out.println("Saldo Anda tidak cukup.");
                        return;
                    }
                }
                // Tulis objek Nasabah (diperbarui atau tidak) ke file sementara
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Salin isi file sementara kembali ke file asli
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))
        ) {
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                out.writeObject(nasabah);
            }
        } catch (EOFException e) {
            // Akhir file tercapai
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}



