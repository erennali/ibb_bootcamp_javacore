package com.erenalikoca._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_3_LocalDateTime {


    // Yeni nesil Date
    // LocalDateTime (1)

    public static void localDateFormatGetMethod() {

        LocalDateTime localDateTime = LocalDateTime.now();
        Locale locale = new Locale("tr", "TR");
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);

        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",locale);
        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss",locale);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss", locale);

        //normal çıktı
        System.out.println("Şu andaki zaman: " + localDateTime);
        System.out.println("Şu andaki zaman formatlı : " + localDateTime.format(formatter));
    }

    // LocalDateTime (2)
    public static void localDateFormatGetMethod2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Gün : " + localDateTime.getDayOfMonth());
        System.out.println("Kaçıncı ay : " + localDateTime.getMonthValue());
        System.out.println("Yıl : " + localDateTime.getYear());
        System.out.println("Saat : " + localDateTime.getHour());
        System.out.println("Dakika  : " + localDateTime.getMinute());
        System.out.println("Saniye : " + localDateTime.getSecond());
        System.out.println("##########################");
    }

    public static void localDateFormatSetMethod2() {
        Locale locale = new Locale("tr", "TR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss", locale);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime newData = localDateTime
                .withDayOfMonth(1)
                .withMonth(1)
                .withYear(2000)
                .withHour(0)
                .withMinute(0)
                .withSecond(0);
        //System.out.println(now);
        System.out.println("Normal Tarih: "+localDateTime);
        System.out.println("Değiştirilmiş Tarih: "+newData.format(formatter));
    }

    public static void main(String[] args) {
        //localDateFormatGetMethod1();
        //localDateFormatGetMethod2();
        localDateFormatSetMethod2();
    }

}
