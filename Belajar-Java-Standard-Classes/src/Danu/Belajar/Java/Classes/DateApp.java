package Danu.Belajar.Java.Classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {

    public static void main(String[] args) {

        Date tanggal = new Date();

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2004);
        calendar.set(Calendar.MONTH , Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH,15);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
