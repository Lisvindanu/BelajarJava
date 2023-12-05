package Danu.Belajar.Java.Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Lisvindanu nyoba jadi jago";

        Pattern pattern = Pattern.compile("(Lisvindanu|nyoba).*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
