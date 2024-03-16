package PZN.Generic.Application;

import PZN.Generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Lisvin");
        objectMyData.setData(1000);
        MyData<? super String > myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());

    }
    public static void process(MyData<? super  String> myData) {
        Object value =  myData.getData();
        System.out.println("Process Parameter " + value);
        myData.setData("Danu");
    }
}
