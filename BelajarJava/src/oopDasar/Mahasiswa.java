package oopDasar;

public class Mahasiswa {
    private String nama;
    private MataKuliah[] mataKuliah;

    // Constructor
    public Mahasiswa(String nama, int jumlahMataKuliah) {
        this.nama = nama;
        mataKuliah = new MataKuliah[jumlahMataKuliah];
    }

    // Getter dan setter untuk nama dan mataKuliah

    public void inputMataKuliah(int index, String namaMatkul, int sks, int angkaNilai) {
        if (index >= 0 && index < mataKuliah.length) {
            mataKuliah[index] = new MataKuliah(namaMatkul, sks, angkaNilai);
        } else {
            System.out.println("Index mata kuliah tidak valid.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i] != null) {
                System.out.println("Mata Kuliah ke-" + (i + 1) + ": " + mataKuliah[i].getNamaMatkul());
                System.out.println("Angka Nilai: " + mataKuliah[i].getAngkaNilai());
            }
        }
        System.out.println("IPK: " + hitungIPK());
    }

    private double hitungIPK() {
        int totalSKS = 0;
        double totalBobot = 0.0;

        for (MataKuliah matkul : mataKuliah) {
            if (matkul != null) {
                totalSKS += matkul.getSks();
                totalBobot += matkul.getAngkaNilai() * matkul.getSks(); // Hitung total bobot (nilai * sks)
            }
        }

        double ipk = totalBobot / totalSKS; // Hitung IPK berdasarkan bobot nilai dan total SKS
        return Math.min(ipk, 4.0); // Batasi IPK maksimal menjadi 4.0
    }


}

class MataKuliah {
    private String namaMatkul;
    private int sks;
    private int angkaNilai;

    public MataKuliah(String namaMatkul, int sks, int angkaNilai) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.angkaNilai = angkaNilai;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public int getAngkaNilai() {
        return angkaNilai;
    }
}
