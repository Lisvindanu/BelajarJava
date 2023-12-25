package CekUmur;

public class CekUmur {
  private String nama;
  private int umur;

  //konstruktor
    public CekUmur(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void show(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }

    public void cekUmur(){
        if(umur<18){
            System.out.println("Cih bocil");
        }else {
            System.out.println("Anjay gede");
        }

    }
}
