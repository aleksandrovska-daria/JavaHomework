package Homework6;

import java.util.Random;

//В одновимірному масиві, заповненому випадковими числами,
//визначте мінімальний та максимальний елементи, підрахуйте
//кількість від'ємних та додатних елементів, підрахуйте кількість
//нулів. Результати виведіть на екран.

    public class Homework6_8 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100];
        int max = arr[0];
        int min = arr[0];
        int pos = 0;
        int neg = 0;
        int zer = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-50, 51);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] > 0) {
                pos++;
            }
            if (arr[i] < 0) {
                neg++;
            }
            if (arr[i] == 0) {
                zer++;
            }
        }

        System.out.println("\nМаксимальне число = " + max);
        System.out.println("Мінімальне число = " + min);
        System.out.println("Кількість нулів = " + zer);
        System.out.println("Чисел меньше 0 = " + neg);
        System.out.println("Чисел більше 0 = " + pos);
    }
}
