package PZN.Generic.Application;

import PZN.Generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Lisvindanu");
        MyData<Integer> integerMyData = new MyData<Integer>(3);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
