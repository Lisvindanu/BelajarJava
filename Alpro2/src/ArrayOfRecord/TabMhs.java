package ArrayOfRecord;

import java.util.Scanner;

public class TabMhs {

    int N = 2;
    Mahasiswa[] a = new Mahasiswa[N];

    //	SETTER DAN GETTER
    void SetMhs() {
        Mahasiswa x;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i < N; i++) {
            x = new Mahasiswa();
            System.out.println("Element ke: "+i+" :");
            System.out.print("NIM : "); x.NIM = sc.nextInt();
            System.out.print("NAMA : "); x.nama = sc.next();
            System.out.print("IPK : "); x.IPK = sc.nextFloat();
            a[i] = x;
        }
    }

    void GetMhs() {
        for(int i = 0; i < N; i++) {
            System.out.println("Nilai ke "+i+" ; Nama = "+ a[i].nama +" | NIM = "+ a[i].NIM + " | IPK" + a[i].IPK);
        }
    }

    public static void main (String[] args) {
        TabMhs A= new TabMhs();
        A.SetMhs();
        A.GetMhs();
    }

}