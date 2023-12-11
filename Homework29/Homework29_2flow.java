package Homework29;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
public class Homework29_2flow {

    //Завдання 2: Користувач з клавіатури вводить
    //   значення масив, після чого запускаються два потоки.
    //   Перший потік знаходить суму елементів в масиві.
    //   Другий потік знаходить середнє арифметичне в масиві.
    //   Результати обчислень повертаються у метод main.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть довжину масиву = ");
        int length = sc.nextInt();
        System.out.println("Введіть значення = ");
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = Arrays.stream(arr).parallel().sum();
        System.out.println("Сума = " + sum);

        OptionalDouble avarege = Arrays.stream(arr).parallel().average();
        System.out.println("Середнє арифметичне = " + avarege);

    }
}
