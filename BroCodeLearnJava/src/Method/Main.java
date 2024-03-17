package Method;

public class Main {
    public static void main(String[] args) {
        //method = a block of code that is executed whenever it is called
//      String name = "Bro";
//      int age = 21;
//        hello(name, age);

        int x = 3;
        int y = 4;
//        int z = add(x,y);
//        System.out.println(z);
        System.out.println(add(x, y));
    }

//    static void hello(String name, int age) {
//        System.out.println("Hello " + name );
//        System.out.println("U are " + age + " Years Old ");
//    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

//    public static void Display() {
//        System.out.println(z);
//    }

}
