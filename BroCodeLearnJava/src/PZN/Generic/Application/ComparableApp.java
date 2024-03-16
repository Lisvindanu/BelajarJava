package PZN.Generic.Application;

import PZN.Generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = { new Person("Lisvindanu", "Indonesia"),
                new Person("Ipin", "Bangladesh"),
            new Person("Budi", "Malay")
        };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    };


}
