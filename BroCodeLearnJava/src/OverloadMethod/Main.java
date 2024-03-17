package OverloadMethod;

public class Main {
    public static void main(String[] args) {
        //overload methods = methods that share the same name but have diff param
        //                   method name + parameter = method signature
        double x = add(2.0,3.5,3.3);
        System.out.println(x);

    }
    static int add(int a, int b) {
        System.out.println("this is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c) {
        System.out.println("this is overloaded method #2");
        return a+b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("this is overloaded method #3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("this is overloaded method #4");
        return a+b;
    }
    static double add(double a, double b, double c) {
        System.out.println("this is overloaded method #5");
        return a+b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("this is overloaded method #6");
        return a + b + c + d;
    }
}
