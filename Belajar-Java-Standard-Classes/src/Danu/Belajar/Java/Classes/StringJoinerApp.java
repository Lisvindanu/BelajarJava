package Danu.Belajar.Java.Classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Lisvin");
        joiner.add("Danu");

        String value = joiner.toString();
        System.out.println(value);
    }
}
