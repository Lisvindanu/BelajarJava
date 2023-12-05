package Danu.Belajar.Java.Classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                1,23,4,54,23,42,43,9445,123
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 9445));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 9);
        System.out.println(Arrays.toString(result2));



    }
}
