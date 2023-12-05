package Danu.Belajar.Java.Classes;

import java.math.BigInteger;

public class BigINumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        BigInteger c = a.min(b);

        System.out.println(c);
    }
}
