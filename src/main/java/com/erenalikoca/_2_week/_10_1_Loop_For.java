package com.erenalikoca._2_week;

public class _10_1_Loop_For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - ");
        }

        System.out.println("\n########################\n");
        // for döngüsü sonsuzluk
        // for(;;){}
        int number = 1;
        for (; ; ) {
            System.out.print(number + " ");
            number++;
            if (number >= 50)
                break;
        }

    }
}
