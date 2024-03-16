package Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a list of values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the date : ");
        String day = scanner.nextLine();

        switch (day){
                 case "Sunday":
                         System.out.println("It is Sunday!");
                break;
                case "Monday":
                         System.out.println("It is Monday!");
                break;
                case "Tuesday":
                         System.out.println("It is Tuesday!");
                break;
                case "Wednesday":
                         System.out.println("It is Wednesday!");
                break;
                case "Thursday":
                         System.out.println("It is Thursday!");
                break;
                case "Friday":
                         System.out.println("It is Friday!");
                break;
                case "Saturday":
                         System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("This is not a date");
        }
    }



}
