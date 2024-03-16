package LogicalOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          /*Logical operator = used to connect two or more expressions
                            && = (AND) both condition must be true
                            || = (OR) either condition must be true
                            ! = (NOT) Revers boolean value of a condition
    * */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the temp ");
//        int temp = scanner.nextInt();
//
//        if(temp > 30) {
//            System.out.println("It is hot outside");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("it is warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }

        System.out.println("U are playing a game ! Press q or Q to quit");
        String response = scanner.next();
        if (!response.equals("q" ) && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew");
        } else {
            System.out.println("You quit the game");
        }
    }



}
