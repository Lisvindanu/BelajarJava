public class CekUmur {
    static void cekUmur(int umur){
        if(umur < 18){
            System.out.println("Akses Ditolak");
        }else {
            System.out.printf("Akses Diterima");
        }
    }

    public static void main(String[] args) {
        cekUmur(20);
    }
}
