package org.example.homework_3;

public class HomeWork3 {
    public static void main (String[] args ){

        // задание номер 4
        int mounth = 3;

        String text = "marth";

        switch (mounth) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println(text);
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("jule");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("octomber");
                break;
            case 11:
                System.out.println("novemder");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println();
        }
        // задание ноиер 5, написать числа от 100 до 1000 которые деляться на 5
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        // Написать  цикл(ы) который(е) отображает(ют) в консоль сумму следующей серии: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
        double sum = 0  ;
        for (double i = 1; i <=97; i = i + 2) {
            sum = sum + (i/(i+2))  ;
        }
        System.out.println(sum);

    }

}



