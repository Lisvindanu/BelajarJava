package ifStatement;

public class Main {
    public static void main(String[] args) {
        int age = 75 ;
        if(age == 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("Ure an adult");
        } else if (age >= 13) {
            System.out.println("Youre teenager");

        } else {
            System.out.println("Kids need to learn more");
        }
    }
}
