package PZN.Generic.Application;

import PZN.Generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Lisvin");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
//        integerMyData.setData(1000);
        Integer integer = integerMyData.getData();
    }
}
