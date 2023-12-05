import java.util.Scanner;

public class karyawanApp {
    //buat variable global untuk input
    static Scanner Inputan = new Scanner(System.in);

    //buat array nya
    static Karyawan arrKaryawan[] = new Karyawan[3];
    //panggil kelas karyawan, terus dibuat inisial yang mencakup array terus buat new objek yang bakal dipake ama inisial
    static void input(){
        String Nik, Nama, Gol;
        int Gaji;
        for(int i=0; i<arrKaryawan.length; i++){
            System.out.println("Nik : " ); Nik = Inputan.next();
            System.out.println("Nama : " ); Nama = Inputan.next();
            System.out.println("Gol : " ); Gol = Inputan.next();
            System.out.println("Gaji : " ); Gaji = Inputan.nextInt();
            arrKaryawan[i] = new Karyawan();
            arrKaryawan[i].inputData(Nik, Nama, Gol, Gaji);
        }
    }

    static void tampil(){
        for(int i=0; i<arrKaryawan.length; i++){
            arrKaryawan[i].tampil();
        }
    }

static void cariNama(){
        String cari;
        String status = "Person not found ";
    System.out.println("Lu nyari siapa? : " ); cari = Inputan.next();

        for(int i=0; i< arrKaryawan.length;i++){
            if (cari.equalsIgnoreCase(arrKaryawan[i].getNama())){
                status = "Founded in index : " + i;
                arrKaryawan[i].tampil();
                break;
            }

        }
    System.out.println(status);
}

    public static void main(String[] args) {

        input();
        tampil();cariNama();
    }
}
