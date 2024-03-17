package printf;

public class Main {
    public static void main(String[] args) {

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        System.out.printf("this is a format string %d", 123);
        System.out.println();
        System.out.printf("%d this is a format string ", 123);
        System.out.println();

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Ipin";
        int myInt = 50;
        double myDouble = 10000;

//        System.out.printf("%b", myBoolean);
//        System.out.println();
//        System.out.printf("%c", myChar);
//        System.out.println();
//        System.out.printf("%s", myString);
//        System.out.println();
//        System.out.printf("%d", myInt);
//        System.out.println();
//        System.out.printf("%f", myDouble);

//        //[width]
//        //minimum number of character to be written as output
//        System.out.printf("Hello %-10s", myString);

        //[Precision]
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f ", myDouble);

//       [flags]
//      adds an effects to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number > 1000

        System.out.printf("You have this much money &.1f", myDouble);
        System.out.printf("You have this much money &f", myDouble);
        System.out.printf("You have this much money &-20f", myDouble);
        System.out.printf("You have this much money &+1f", myDouble);
        System.out.printf("You have this much money &.1f", myDouble);
    }
}
