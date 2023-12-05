package Array;

import java.util.Scanner;

public class ArrayInt2 {

    int N = 5;
    int []a = new int[N];
    //	prosedur
    void isiArray() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<N) {
            System.out.println("Element Ke " + i + ":");
            a[i] = sc.nextInt();
            i = i + 1;
        }
    }

    void TampilArray() {
        int i;
        double total = 0;
        for(i=0; i < N; i++) {
            total = a[i] + total;
            System.out.println("Array ke" + i + " = " + a[i]);
        }
        System.out.println("Rata-rata : " + total);
    }



    public static void main(String[] args){
        ArrayInt2 A = new ArrayInt2();
        A.isiArray();
        A.TampilArray();
    }

}
