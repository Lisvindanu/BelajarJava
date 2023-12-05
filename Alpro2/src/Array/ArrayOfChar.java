package Array;

import java.util.Scanner;

public class ArrayOfChar {
    int N; // Ukuran array
    char[] a; // Array karakter

    void IsiArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String string = sc.nextLine();
        int l = string.length();
        System.out.println("Panjang String: " + l);

        N = l;
        a = new char[N]; // Inisialisasi array dengan ukuran yang tepat

        for (int i = 0; i < N; i++) {
            a[i] = string.charAt(i);
        }
    }

    void tampilArray() {
        for (int i = 0; i < N; i++) {
            System.out.println("Array ke " + i + ": " + a[i]);
        }
    }

    void cariMaks2() {
        int imaks = 0;
        for (int i = 1; i < N; i++) {
            if (a[i] > a[imaks]) {
                imaks = i;
            }
        }
        System.out.println("Nilai terbesar = " + a[imaks]);
        System.out.println("Nilai terbesar di indeks = " + imaks);
    }


    void cekPalindrom() {
        boolean lanjut = true;
        int i = 0;
        while ((i<N/2) && (lanjut==true)){
            if(a[i]==a[N-i-1])
                i++;
            else
                lanjut= false;
        }
        System.out.println("Apakah kata ini palindrom :" + lanjut);
    }
    char GetElemen(int i) {
        return a[i];
    }
    void SetElemen(int i, char x) {
        a[i] = x;
    }
    static boolean IsSamaAB(ArrayOfChar A, ArrayOfChar B) {
        boolean sama = true;
        int i = 0;
        while ((i < A.N) && (sama == true)) {
            if (A.GetElemen(i) == B.GetElemen(i))
                i = i + 1;
            else sama = false;
        }
        return sama;
    }
    public static void SalinLarikA_B(ArrayOfChar A, ArrayOfChar B) {
        B.a = new char[A.N]; // Inisialisasi array B dengan ukuran yang sesuai
        for (int i = 0; i < A.N; i++) {
            B.SetElemen(i, A.GetElemen(i));
        }
        B.tampilArray();
    }

    public static void Membalikkata(ArrayOfChar A, ArrayOfChar B) {
        B.a = new char[A.N]; // Inisialisasi array B dengan ukuran yang sesuai
        for (int i = 0; i < A.N; i++) {
            B.SetElemen(A.N - i - 1, A.GetElemen(i));
        }
        B.tampilArray();
    }

    public static void main(String[] args) {
        ArrayOfChar A = new ArrayOfChar();
        ArrayOfChar B = new ArrayOfChar();
        ArrayOfChar T = new ArrayOfChar(); // Inisialisasi objek T

        System.out.println("Isi Array A");
        A.IsiArray();
        A.tampilArray();
        A.cekPalindrom();

        // Inisialisasi objek T untuk digunakan di Membalikkata dan SalinLarikA_B
        T.a = new char[A.N];

        Membalikkata(A, T);
        SalinLarikA_B(T, A);
        A.tampilArray();

        System.out.println("Isi Array B");
        B.IsiArray();
        B.tampilArray();

        System.out.println("out: Array A dan B sama? " + IsSamaAB(A, B));
    }


}
