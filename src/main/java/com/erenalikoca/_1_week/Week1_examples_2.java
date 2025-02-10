package com.erenalikoca._1_week;


import java.util.Scanner;

/*
2. Santigrat (Celsius) - Fahrenheit Dönüştürücü (Scanner kullanlalım)
   Soru:
   Kullanıcıdan Santigrat (Celsius) cinsinden sıcaklık alıp Fahrenheit'e çeviren programı yazınız.
   Formül: F = (C * 9/5) + 32
   Çözüm:
 */

public class Week1_examples_2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        double celsius,fahrenheit;
        System.out.println("Derece giriniz : ");
        celsius = klavye.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit : "+fahrenheit);
        klavye.close();
    }
}
