package com.erenalikoca._2_week;

import java.util.Scanner;

public class _14_1_Exception {

    public static void calcula() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter a number 1: ");
        number1 = scanner.nextInt();

        System.out.print("Enter a number 2: ");
        number2 = scanner.nextInt();

        try {

            int result = number1 / number2;
            System.out.println("Result: " + result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("İstisna olsada olmazsada mutlaka yapılacak iş");
            scanner.close();
        }

        System.out.println("Son 10.000 satır");
    }

    public static void main(String[] args) throws Exception {

        calcula();
        System.out.println("################################");

        // Bilerek istisna gönder
        throw new NullPointerException("Neden boş verdiniz");
    }
}
