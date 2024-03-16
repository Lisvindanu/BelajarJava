package PZN.Generic.Application;

import PZN.Generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Lisvin");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }


    public static void process(MyData<? extends  Object> myData){
        System.out.println(myData.getData());

//        myData.setData(); // tidak boleh karena berbahaya

    }
}
