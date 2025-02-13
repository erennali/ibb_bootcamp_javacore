package com.erenalikoca._2_week;


/*
Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan Algoritma ?
Şartlar - 1 : Kullanıcı eğer sayı olarak  100  fazla sayı girerse 100 kadar toplasın. (break)
Şartlar - 2 : Kullanıcı verdiği sayılar içinde eğer 47 varsa bunu toplamaya dahil etmesin.(continue)
Çıkan sonuç tek mi ? çift mi ?
 */


import java.util.Scanner;

public class _11_1_Return_Continue_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz : ");
        int number = Math.abs(scanner.nextInt());

        int toplam = 0;
        for (int i = 1; i <= number; i++) {
            if (i == 47) {
                continue;
            }
            toplam += i;
            if (i > 100) {
                System.out.println("Girilen sayınız 100 den büyük olduğundan işlem 100den sonra sonlandı");
                break;
            }
        }
        System.out.println("Toplam : " + toplam);

        System.out.println(toplam%2==0 ? "Sayı Çift: "+toplam : "Sayı Tek : "+ toplam );

        scanner.close();
    }
}
