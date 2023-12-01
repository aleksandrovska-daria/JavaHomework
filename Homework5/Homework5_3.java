package Homework5;

import java.util.Scanner;

    public class Homework5_3 {

        //Користувач вводить з клавіатури довжину та ширину
        //прямокутника. Виведіть на екран незаповнений прямокутник
        //(відображаються лише межі прямокутника). Розмір довжини та
        //ширини дорівнює введеним даним.

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть першу сторону прямокутника а = ");
            System.out.println("Введіть першу сторону прямокутника b = ");

            int a = sc.nextInt(); // перша сторона прямокутника
            int b = sc.nextInt(); // друга сторона прямокутника

            for (int k = 0; k < a; k++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 1; j < b - 1; j++) {
                System.out.print("* ");
                for (int l = 1; l < a - 1; l++) {
                    System.out.print("  ");
                }
                System.out.println("* ");
            }
            for (int m = 0; m < a; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

