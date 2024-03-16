package PZN.Generic.Application;

import PZN.Generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Lisvindanu");
       // doIt(stringMyData); // error
        // MyData<Object> objectMyData = stringMyData; // error

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData; // Error
//        doIt(doItInteger());
    }

    public static void doIt(MyData<Object> objectMyData) {

    }
    public static void doItInteger(MyData<Integer> integerMyData) {

    }
}
