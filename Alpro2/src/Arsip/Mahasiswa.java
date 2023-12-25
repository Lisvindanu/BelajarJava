package Arsip;

import java.util.Scanner;

import java.io.Serializable;

public class Mahasiswa implements Serializable {

    Mahasiswa(){
        //create konstruktor

    }
    Mahasiswa(int Mynim, String mynama, float myip ){
        //create konstruktor
            NIM = Mynim;
            nama = mynama;
            IPK = myip;

    }

    //	TIPE DATA RECORD
    int NIM;
    String nama;
    Float IPK;

//	ARRAY OF MAHASISWA

    //	SETTER DAN GETTER
    void SetMhs() {
        Scanner sc= new Scanner(System.in);
        System.out.print("NIM : "); NIM = sc.nextInt();
        System.out.print("NAMA : "); nama = sc.next();
        System.out.print("IPK : "); IPK = sc.nextFloat();
    }

    void GetMhs() {
        System.out.println("Nama = "+ nama +" | NIM = "+ NIM + " | IPK = " + IPK);
    }
}
