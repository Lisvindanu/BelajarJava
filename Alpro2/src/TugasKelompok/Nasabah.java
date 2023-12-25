package TugasKelompok;

import java.io.*;
import java.util.Scanner;

public class Nasabah implements java.io.Serializable {

    int Norek;
    String Nama;
    Double Saldo;

    public Nasabah() {

    }

    Nasabah(int Norek, String Nama, Double Saldo) {
        this.Norek = Norek;
        this.Nama = Nama;
        this.Saldo = Saldo;
    }

    void BacaNasabah() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Norek : ");Norek=Input.nextInt();
        System.out.println("Nama : ");Nama=Input.next();
        Input.nextLine();
        System.out.println("Saldo : ");Saldo=Input.nextDouble();
    }

    void TulisNasabah(){
        System.out.println(Norek+", " + Nama+ ", "+ Saldo);
    }
    int getNorek() {
        return Norek;
    }
    String getNama() {
        return Nama;
    }
    Double getSaldo(){
        return Saldo;
    }

    void setNorek(int NorekBaru) {
        Norek=NorekBaru;
    }

    void setNama(String NamaBaru) {
        Nama=NamaBaru;
    }

    void setSaldo(double SaldoBaru){
        Saldo=SaldoBaru;
    }
}