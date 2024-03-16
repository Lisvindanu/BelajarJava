package PZN.Generic.Application;

import PZN.Generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Lisvin", "Danu", "Ganteng"};
        Integer[] number = {1,2,3,4,5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(number));
    }
}
