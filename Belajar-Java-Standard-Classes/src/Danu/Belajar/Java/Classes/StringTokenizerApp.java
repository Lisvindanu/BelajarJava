package Danu.Belajar.Java.Classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Lisvin Danu Ganteng";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
