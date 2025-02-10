package com.erenalikoca._1_week;

import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {
        String name,surname;
        int language;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = klavye.nextLine();
        System.out.println("Enter your surname: ");
        surname = klavye.nextLine();
        System.out.println("Enter your language: ");
        language = klavye.nextInt();
        System.out.println("Hello "+name+" "+surname+" you are learning "+language+" language.");

        klavye.close();
    }
}
