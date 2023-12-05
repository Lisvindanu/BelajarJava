import java.util.Scanner;

public class UtamaBuku {

    //method
    static Scanner Inputan = new Scanner(System.in);
    //NamaKelas alias = new NamaKelas();

   // static Buku buku = new Buku();

    static Buku[] arrayBuku = new Buku[3];
    //array kelas buku dengan index 0-2

    static void input(){
        String judul, penulis, penerbit;
        int harga;

        //buku.inputNilai(judul, penulis,penerbit,harga);

        for(int i=0; i<arrayBuku.length; i++){
            System.out.print("Masukan judul : "); judul = Inputan.nextLine();
            System.out.print("Masukan penulis : "); penulis = Inputan.nextLine();
            System.out.print("Masukan penerbit : "); penerbit = Inputan.nextLine();
            System.out.print("Masukan harga : "); harga = Inputan.nextInt();
            arrayBuku [i] = new Buku();
            arrayBuku [i].inputNilai(judul, penulis, penerbit, harga);
        }
    }

    static void tampil (){
        for(int i=0; i<arrayBuku.length; i++){
            arrayBuku[i].tampilNilai();
        }
    }

    static void cariBuku(){
        String cari;
        String status = "Data not found ";
        System.out.println("Judul yang dicari : "); cari = Inputan.next();
        //melihat
        for (int i=0; i<arrayBuku.length; i++){
            //membandingkan
            if (cari.equalsIgnoreCase(arrayBuku[i].getJudul())){
                //memutuskan
                status = "Founded, in array : " + i;
                arrayBuku[i].tampilNilai();
                break;
            }

        }
        System.out.println(status);

    }

    public static void main(String[] args) {




       input();
       tampil();
       cariBuku();
    }

}
