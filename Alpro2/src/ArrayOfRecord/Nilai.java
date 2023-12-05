package ArrayOfRecord;

import java.util.Scanner;

public class Nilai {

    //	TIPE DATA RECORD
    int NIM;
    String nama;
    float UTS;
    float UAS;
    double NA;
    char index;

//	ARRAY OF MAHASISWA

    //	SETTER DAN GETTER
    void SetNilai() {
        Scanner sc= new Scanner(System.in);
        System.out.print("NIM : "); NIM = sc.nextInt();
        System.out.print("NAMA : "); nama = sc.next();
        System.out.print("UTS : "); UTS = sc.nextFloat();
        System.out.print("UAS : "); UAS = sc.nextFloat();
//		System.out.print("NA : "); NA = sc.nextFloat();
        NA = 0.3 * UTS + 0.7 * UAS;
//		System.out.print("Index : "); index = sc.next();
        SetIndex();
    }

    void SetIndex() {
        if(NA>= 85) {
            index = 'A';
        } else if(NA >= 75){
            index = 'B';
        } else if(NA >= 55){
            index = 'C';
        } else if(NA >= 45){
            index = 'D';
        } else {
            index = 'E';
        }
    }

    void GetNilai() {
        System.out.println("Nama = "+ nama +" | NIM = "+ NIM + " | UTS = " + UTS + " | UAS = " + UAS + " | NA = " + NA + " | IDX = " + index);
    }

}