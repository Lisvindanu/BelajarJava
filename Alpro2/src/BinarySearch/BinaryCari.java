package BinarySearch;

public class BinaryCari {

    String sNama;
    String sNpm;
    String sKelas;
    Double dIpk;

    public BinaryCari(String Nama, String Npm, String Kelas, Double Ipk){
            this.sNama = Nama;
            this.sNpm = Npm;
            this.sKelas = Kelas;
            this.dIpk = Ipk;
    }

    public String GetNama(){
        return sNama;
    }

    public void tampil() {
        System.out.println("Nama : " + sNama);
        System.out.println("Npm : " + sNpm);
        System.out.println("Kelas : " + sKelas);
        System.out.println("Ipk : " + dIpk);
    }
}
