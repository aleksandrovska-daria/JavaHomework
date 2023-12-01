package Homework5;

 import java.util.Scanner;

    public class Homework5_2 {

        //Користувач вводить з клавіатури розмір сторони квадрата.
        //Виведіть на екран незаповнений квадрат (відображаються лише
        //межі квадрата). Розмір сторони дорівнює введеному розміру.

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть сторону квадрату");
            int a = sc.nextInt(); // сторона квадрату

            for (int k = 0; k < a; k++) {
                for (int m = 0; m < a; m++) {
                    if (k == 0 || k == a - 1) {
                        System.out.print("* ");
                    } else if (m == a - 1 || m == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

