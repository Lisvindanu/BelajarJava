package Danu.Belajar.Java.Classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Lisvin");
        builder.append(" ");
        builder.append("Danu");

        String name = builder.toString();
        System.out.println(name);
    }
}
