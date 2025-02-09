package com.erenalikoca._1_week;

public class _06_Math {
    public static void main(String[] args) {
        //NaN : Not A Number
        System.out.println("En küçük: " + Math.min(3,10));
        System.out.println("En büyük: " + Math.max(3,10));
        System.out.println("Mutlak: " + Math.abs(-7));
        System.out.println("Karekök: " + Math.sqrt(25));
        System.out.println("Karekök: " + Math.sqrt(Math.abs(-25)));

        System.out.println("Üslü: " + Math.pow(2,5));

        System.out.println("Alt yuvarla : " + Math.floor(2.9));
        System.out.println("Üst yuvarla : " + Math.ceil(2.1));
        System.out.println("Üst yuvarla : " + Math.ceil(2.00001));

        System.out.println("Ort yuvarla : " + Math.round(3.4));
        System.out.println("Ort yuvarla : " + Math.round(3.5));

        System.out.println("Pi : " + Math.PI);
        System.out.println("E : " + Math.E);





    }
}
