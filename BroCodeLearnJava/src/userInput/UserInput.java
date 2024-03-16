package userInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name");
        String name = input.nextLine();
        System.out.println("How old are u?");
        int age = input.nextInt();
       input.nextLine();
        System.out.println("What is fav food?");
        String food = input.nextLine();
        System.out.println("Hello " + name + " 😁");
        System.out.println("U are " + age + " years old");
        System.out.println("U likes " + food);
    }
}
