package Danu.Belajar.Java.Classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umur : ");
        Integer umur = scanner.nextInt();


        System.out.println("Hello "+ nama + " umur anda adalah " + umur);
    }
}
