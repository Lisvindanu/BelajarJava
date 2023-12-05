package SequentialSearch;

import java.util.Scanner;

public class YangDiCari {

    //buat var global untuk input

    static Scanner inputan = new Scanner(System.in);

    // buat array
    static AppYangDicari arrCari[] = new AppYangDicari[3];

    // panggil kelas AppYangDicari, buat inisial yang mencakup arr, abis tu bikin new objek yang bakal jadi insial

    static void input(){
        String Nama, Npm, Kelas;
        double Ipk;
        for(int i=0; i< arrCari.length; i++){
            System.out.println("Nama : ");  Nama= inputan.nextLine();
            System.out.println("Npm : "); Npm = inputan.nextLine();
            System.out.println("Kelas : "); Kelas = inputan.nextLine();
            System.out.println("Ipk : "); Ipk = inputan.nextDouble();
            inputan.nextLine();
            arrCari[i] = new AppYangDicari();
            arrCari[i].InputData(Nama, Npm, Kelas, Ipk);
        }
    }

    static void tampil(){
        for(int i=0; i< arrCari.length; i++){
            arrCari[i].tampil();
        }
    }
    static void  cariNama(){
        String cari;
        String status = "Belum ketemu 🙏";
        System.out.println("Mencari Siapa? : "); cari = inputan.next();

        for (int i=0; i< arrCari.length; i++){
            if(cari.equalsIgnoreCase(arrCari[i].getsNama())){
                status = "Ketemu di Index ke : " + i;
                arrCari[i].tampil();
                break;
            }
        }
        System.out.println(status);
    }
    public static void main(String[] args) {

        input();
        tampil();cariNama();
    }
}

