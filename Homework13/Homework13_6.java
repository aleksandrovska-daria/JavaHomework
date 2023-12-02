package Homework13;

import java.util.Random;
import java.util.Scanner;

public class Homework13_6 {

    // 1. Створіть квадратний масив розмірності n заповнений
    //випадковими числами. Виведіть масив на екран у вигляді таблиці.

    // 2.Знайдіть найменший і найбільший елементи масиву і
    //виведіть їх на екран (якщо знайдено кілька однакових елементів
    //— виведіть індекси рядка та стовпця, де є повторення).

    // 3.Виведіть на екран час виконання пошуку в мілісекундах. Розмірність
    //масиву має задаватися з клавіатури.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмірність n масиву: ");

        int n = sc.nextInt();
        int[][] Array = new int[n][n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array[i][j] = random.nextInt(10, 100);
                System.out.print(Array[i][j] + " ");
                if (Array[i][j] > max) {
                    max = Array[i][j];
                }
                if (Array[i][j] < min) {
                    min = Array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
        System.out.println("max = " + max + ", min = " + min);
        System.out.println("------------------");

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                int Arrayrepeat = Array[i][j]; // змінна, яку використовую для збереження числа, яке буде повторюватися
                boolean repeat = false;
                for (int k = 0; k < i; k++) {
                    for (int l = 0; l < Array[k].length; l++) {
                        if (Array[k][l] == Arrayrepeat) {
                            repeat = true;
                            System.out.print("Число " + Arrayrepeat + " з індексами (" + k + "," + l + ")");
                        }
                    }
                }
                if (repeat) {
                    System.out.println(" повторюється у (" + i + "," + j + ") рядку і стовпці відповідно");
                }
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("------------------");
        System.out.println("Час виконання пошуку в мілісекундах - " + (stop - start));
        System.out.println("------------------");
    }
}
