package Array;

import java.util.Scanner;

public class ArrayChar {

    int N = 8;
    char[] a = new char[N];
    int realN;

    void IsiArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String S = sc.nextLine();
        int l = S.length();
        System.out.println("Panjang string: " + l);

        if (l < N)
            N=l;
        else l=N;
        for (int i = 0; i < N; i++) {
            if (i < l) {
                a[i] = S.charAt(i);
            } else {
                a[i] = ' '; // Fill the rest with spaces
            }
        }
    }

    void TampilArray() {
        for (int i = 0; i < N; i++) {
            System.out.println("array ke " + i + ": " + a[i]);
        }
    }

    void CariMaks() {
        char maks = a[0];
        int imaks = 0;
        for (int i = 1; i < N; i++) {
            if (a[i] > maks) {
                maks = a[i];
                imaks = i;
            }
        }
        System.out.println("Nilai terbesar = " + maks);
        System.out.println("Nilai terbesar di indeks = " + imaks);
    }

    void CariMaks2() {
        int imaks = 0;
        for (int i = 1; i < N; i++) {
            if (a[i] > a[imaks]) {
                imaks = i;
            }
        }
        System.out.println("Nilai terbesar = " + a[imaks]);
        System.out.println("Nilai terbesar di indeks = " + imaks);
    }

    void CekPalindrom() {
        boolean lanjut = true;
        int i = 0;
        while (i < N / 2 && lanjut) {
            if (a[i] != a[N - i - 1]) {
                lanjut = false;
            }
            i++;
        }
        System.out.println("Apakah kata ini palindrom: " + lanjut);
    }

    char GetElemen(int i) {
        return a[i];
    }

    void SetElemen(int i, char x) {
        a[i] = x;
    }

    static boolean IsSamaAB(ArrayChar A, ArrayChar B) {
        if (A.N != B.N) {
            return false; // Arrays have different lengths
        }

        for (int i = 0; i < A.N; i++) {
            if (A.GetElemen(i) != B.GetElemen(i)) {
                return false; // Found a difference
            }
        }

        return true;
    }

    static void SalinLarikA_B(ArrayChar A, ArrayChar B) {
        for (int i = 0; i < A.N; i++) {
            char x = A.GetElemen(i);
            B.SetElemen(i, x);
        }
    }

    static void Membalikkata(ArrayChar A, ArrayChar B) {
        for (int i = 0; i < A.N; i++) {
            char x = A.GetElemen(i);
            B.SetElemen(A.N - i - 1, x);
        }
    }

    public static void main(String[] args) {
        ArrayChar A = new ArrayChar();
        ArrayChar B = new ArrayChar();
        ArrayChar T = new ArrayChar();

        System.out.println("Isi Array A");
        A.IsiArray();
        A.TampilArray();
        A.CariMaks2();
        A.CekPalindrom();
        Membalikkata(A, T);
        SalinLarikA_B(T, A);
        A.TampilArray();

        System.out.println("Isi Array B");
        B.IsiArray();
        B.TampilArray();

        // Check if Array A and B are the same
        System.out.println("Are Array A and B the same? " + IsSamaAB(A, B));
    }
}