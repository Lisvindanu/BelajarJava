package oopDasar;
import java.util.Scanner;

public class MahasiswaApp {
    static Scanner inputan = new Scanner(System.in);
    static Mahasiswa[] arrMhs;

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = inputan.nextInt();
        arrMhs = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String namaMhs = inputan.next();

            System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
            int jumlahMataKuliah = inputan.nextInt();

            arrMhs[i] = new Mahasiswa(namaMhs, jumlahMataKuliah);

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Masukkan nama mata kuliah ke-" + (j + 1) + ": ");
                String namaMatkul = inputan.next();

                System.out.print("Masukkan jumlah SKS mata kuliah tersebut: ");
                int sks = inputan.nextInt();

                System.out.print("Masukkan angka nilai mata kuliah tersebut: ");
                int angkaNilai = inputan.nextInt();

                arrMhs[i].inputMataKuliah(j, namaMatkul, sks, angkaNilai);
            }
        }

        // Menampilkan informasi mahasiswa dan mata kuliah yang diambil
        for (Mahasiswa mahasiswa : arrMhs) {
            mahasiswa.tampilkanInfo();
        }
    }
}
