public class Buku {
    /*|

    Record bukan kelas utama sehingga tidak perlu menambahkan main proggram
    karena record adalah kelas struktur data
    yang dibuat adalah kelas buku yang dimana objek buku memiliki atribut
    judul
    penulis
    penerbit
    harga
    maka atribut akan dibuat menjadi var global (terletak diluar main method) ((void static void main))

    dalam record, field tidak boleh langsung diakses
    input nilai dan tampil nilai dari field harus dilakukan melalui method(prosedur atau fungsi)
     */

    String stringJudul;
    String stringPenulis;
    String stringPenerbit;
    int intHarga;

    public void inputNilai (String judul, String penulis, String penerbit, int harga){
        stringJudul = judul;
        stringPenulis = penulis;
        stringPenerbit = penerbit;
        intHarga = harga;
    }

    public void tampilNilai(){
        System.out.println("Judul : " + stringJudul);
        System.out.println("penulis : " + stringPenulis);
        System.out.println("penerbit : " + stringPenerbit);
        System.out.println("harga : " + intHarga);
    }

    public String getJudul () {
        return stringJudul;
    }
}
