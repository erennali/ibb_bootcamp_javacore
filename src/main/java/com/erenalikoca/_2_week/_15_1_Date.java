package com.erenalikoca._2_week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {
    public static void dateGetMethod() {
        Date now = new Date();
        System.out.println("Şu anki zaman: " + now);
        System.out.println("1 ocak 1970 yılından şimdi ki zamana kadar geçen sürenin milisaniye cinsinden:" + now.getTime());
        System.out.println("Date : " + now.getDate());

        System.out.println("#######################################");
        System.out.println("Day : " + now.getDay());
        System.out.println("Month : " + now.getMonth());
        System.out.println("Year : " + (1900+now.getYear()));
        System.out.println("Date Yıl : " + (2025-now.getYear()));
        System.out.println("Hour : " + now.getHours());
        System.out.println("Minute : " + now.getMinutes());
        System.out.println("Second : " + now.getSeconds());
    }

    // Date (GET)
    public static void dateSetMethod() {

    }


    // 1.YÖNTEM()
    public static String newFormat1() throws  NullPointerException{
        Date now = new Date();
        String specialFormat = "Şimdiki zaman : "
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }

    //2.YÖNTEM()
    public static String newFormat2() throws  NullPointerException{
        Date now = new Date();
        // %s: String
        // %d: Decimal
        // %f: Float
        return String.format("Şimdiki zaman : %02d:%02d:%02d", now.getHours(), now.getMinutes(), now.getSeconds());
    }

    //3.YÖNTEM()

    public static String newFormat3() throws  NullPointerException{
        Date now = new Date();
        Locale locale = new Locale("tr", "TR");

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss", locale);

        String formatedDate = String.format("Şimdiki zaman : %s" , sdf.format(now));
        return new Date().toString() + " " + formatedDate;
    }



    public static void main(String[] args) {
        dateGetMethod();
        //dateMethod();

       /* String nowDate = nowFormat1();
        System.out.println(nowDate);*/

        String newFormat1 = newFormat1();
        String newFormat2 = newFormat2();
        String newFormat3 = newFormat3();
        System.out.println(newFormat1);
        System.out.println(newFormat2);
        System.out.println(newFormat3);
    }
}
