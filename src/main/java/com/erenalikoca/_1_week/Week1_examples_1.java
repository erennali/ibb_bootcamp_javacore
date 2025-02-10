package com.erenalikoca._1_week;

import java.util.Scanner;

        /*
1. 1. Dereceden 1 Bilinmeyenli Denklemi Çözme (Scanner kullanlalım)
      Soru:
      Kullanıcıdan ax + b = 0 denklemindeki a ve b değerlerini alıp x'i hesaplayan programı yazınız.
      Çözüm:
 */

public class Week1_examples_1 {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        double aValue,bValue=0,result;

        System.out.println("B değerini giriniz : ");
        bValue = klavye.nextDouble();

        System.out.println("A değerini giriniz : ");
        aValue = klavye.nextDouble();

        result = -bValue/aValue;
        System.out.println("a değeri : "+aValue+" b değeri : "+bValue + " sonuç: "+result);

        klavye.close();
    }
}
