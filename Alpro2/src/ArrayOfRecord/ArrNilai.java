package ArrayOfRecord;

import java.util.Scanner;

public class ArrNilai {

    int N = 2;
    Nilai[] a = new Nilai[N];

    //	SETTER DAN GETTER
    void SetMhs() {
        Nilai x;
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i < N; i++) {
            x = new Nilai();
            System.out.println("Element ke: "+i+" ;");
            x.SetNilai();
            a[i] = x;
        }
    }

    void GetMhs() {
        for(int i = 0; i < N; i++) {
            System.out.println("Nilai ke "+i+" ;");
            a[i].GetNilai();
        }
    }

    public static void main (String[] args) {
        ArrNilai A= new ArrNilai();
        A.SetMhs();
        A.GetMhs();
    }

}

