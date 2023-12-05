package Danu.Belajar.Java.Classes;

public class StringApp {
    public static void main(String[] args) {

        String nama = "Lisvin danu" ;
        String namaLowercase = nama.toLowerCase();
        String namaUppercase = nama.toUpperCase();

        System.out.println(nama);
        System.out.println(namaLowercase);
        System.out.println(namaUppercase);
        System.out.println(nama.length());
        System.out.println(nama.startsWith("Lisvin"));
        System.out.println(nama.endsWith("danu"));

        String[] names = nama.split(" ");
        for(var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(nama.charAt(2));

        char[] chars = nama.toCharArray();
    }
}
