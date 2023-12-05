package Danu.Belajar.Java.Classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("App"));

        System.gc();

        System.exit(99);

        System.out.println("hi");
    }
}
