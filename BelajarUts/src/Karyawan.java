public class Karyawan {
    String stringNik;
    String stringNama;
    String stringGol;
    int intGaji;

    public void inputData(String Nik, String Nama, String Gol, int Gaji){
        stringNik = Nik;
        stringNama = Nama;
        stringGol = Gol;
        intGaji = Gaji;
    }

    public void tampil (){
        System.out.println("Nik : " + stringNik);
        System.out.println("Nama : " + stringNama);
        System.out.println("Golongan : " + stringGol);
        System.out.println("Gaji : " + intGaji);
    }

    public String getNama(){
        return stringNama;
    }
}
