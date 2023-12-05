package SequentialSearch;

public class AppYangDicari {
    String sNama;

    String sNpm;

    String sKelas;

    double dIpk;


    public void InputData (String Nama, String Npm, String Kelas, double Ipk){
        sNama = Nama;
        sNpm = Npm;
        sKelas = Kelas;
        dIpk = Ipk;
    }

    public void tampil(){
        System.out.println("Nama : " + sNama);
        System.out.println("Npm : " + sNpm);
        System.out.println("Kelas : " +sKelas);
        System.out.println("Ipk : " + dIpk);
    }

    public String getsNama() {return sNama;}
}
