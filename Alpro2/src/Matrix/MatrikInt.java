package Matrix;

import java.util.Scanner;

import Array.ArrayInt;

public class MatrikInt {
    // baris

    int N = 3;

    // kolom

    int M = 3;
    int[][] a = new int[N][M];

    //pembuatan transpose dan perkalian 2 buah matrix
    // jumlah baris A sama dengan jumlah kolom B

    void BacaMatrik() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Elemen ke : " + i + " Kolom " + j);
                a[i][j] = sc.nextInt();
            }
        }
    }

    void TampilMatrik() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    int Get(int i, int j) {return a[i][j];}

    void set(int i, int j, int x) {a[i][j] = x;}

    static void PenjumlahanMatrik(MatrikInt A, MatrikInt B, MatrikInt C){
        int x;
        int y;
        for (int i=0; i<A.N; i++){
            for (int j=0; j<A.M; j++){
                x = A.Get(i, j);
                y = B.Get(i, j);
                C.set(i,j, x+y);
            }
            System.out.println(" ");
        }
    }
    static void PenguranganMatrik(MatrikInt A, MatrikInt B, MatrikInt C) {
        int x;
        int y;
        for (int i=0; i<A.N; i++) {
            for (int j=0; j<A.M; j++) {
                x = A.Get(i, j);
                y = B.Get(i, j);
                C.set(i,j, x-y);
            }
            System.out.println(" ");
        }
    }

    static Boolean isSama(MatrikInt A, MatrikInt B) {
        Boolean sama = true;
        int x,y;
        int i,j;
        i = 0;
        while((i < A.N) && (sama == true)) {
            j = 0;
            while((j<A.M) && (sama == true)) {
                x = A.Get(i, j);
                y = B.Get(i, j);
                if(x != y) {
                    sama = false;
                } else {
                    j++;
                }

            }
            i++;
        }
        return sama;
    }

    void TampilDiagonal() {
        for (int i=0; i<N; i++) {
//				System.out.print("Element ke: " + i + " kolom " + j);
            System.out.print(a[i][i] + " ");
            System.out.println(" ");
        }
    }


    public static void main(String[] args){
        MatrikInt A = new MatrikInt();
        MatrikInt B = new MatrikInt();
        MatrikInt C = new MatrikInt();

        A.BacaMatrik();
        System.out.println("Tampil Matrix");
        A.TampilMatrik();
        System.out.println("Tampil diagonal ");
        A.TampilDiagonal();

        B.BacaMatrik();
        B.TampilMatrik();
//		PenguranganMatrik(A, B, C);
//		C.TampilMatrik();

//		boolean sama = isSama(A, B);
//		System.out.println("Matriks A dan Matriks B sama adalah : " + sama);



    }
}
