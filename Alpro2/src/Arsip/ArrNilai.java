package Arsip;


import java.util.Scanner;

public class ArrNilai {

    int N = 2;
    Mahasiswa[] a = new Mahasiswa[N];

    //    SETTER DAN GETTER
    void SetMhs() {
        Mahasiswa x;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            x = new Mahasiswa();
            System.out.println("Element ke: " + i + " ;");
            x.SetMhs();
            a[i] = x;
        }
    }

    void GetMhs() {
        for (int i = 0; i < N; i++) {
            System.out.println("Nilai ke " + i + " ;");
            a[i].GetMhs();
        }
    }

    public static void main(String[] args) {
        ArrNilai A = new ArrNilai();
        A.SetMhs();
        A.GetMhs();
    }
}
