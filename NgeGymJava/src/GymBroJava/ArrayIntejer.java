//import java.util.Scanner;
//
//public class ArrayIntejer {
//    int N=5;
//    int [] a=new int[N];
//
//    void InitArray () {
//        a [0]=45;
//        a [1]=18;
//        a [2]=39;
//        a [3]=22;
//        a [4]=35;
//    }
//    void BacaArray() {
//        Scanner sc= new Scanner(System.in);
//        for (int i=0 ; i<N;i++) {
//            System.out.print("elemen ke "+i+":"); a[i]=sc.nextInt();
//        }
//    }
//    void TampilArray() {
//        for (int i=0;i<N;i++) {
//            System.out.println("Nilai ke :"+i+" "+a[i]);
//        }
//    }
//    void sekuensialSearch(int x) {
//        int i=0;
//        while ((i<=N-2)&&(a[i]!=x)){
//            i=i+1;
//        }
//        if (a[i]==x)
//            System.out.println("ketemu di indeks ke-:" + i);
//
//        else
//            System.out.println("Tidak ketemu" );
//
//    }
//
//    void NilaiMaks() {
//        int imax=0;
//        for (int i=0;i<N;i++) {
//            if (a[i]>a[imax])
//                imax=i;
//        }
//
//        System.out.println("Nilai Terbesar :"+a[imax]);
//        System.out.println("Di Index :"+imax);
//    }
//    void Rata() {
//        int T=0;
//        for (int i=0;i<N;i++) {
//            T=T+a[i];
//        }
//        double Rata=T/N;
//        System.out.println("Rata-rata :"+Rata);
//    }
//
//    public static void main (String[] args) {
//        ArrayIntejer B= new ArrayIntejer();
//
////		B.InitArray();
////		B.ShowArray();
//
//        ArrayIntejer A = new ArrayIntejer();
//        A.BacaArray();A.TampilArray();
//        Scanner sc= new Scanner(System.in);
//        int x;
//        for (int i=1 ; i<=3 ;i++)
//        {
//            System.out.println("Masukan nilai x =");x=sc.nextInt();
//            A.sekuensialSearch(x);
//            ;
//        }
//    }
//}