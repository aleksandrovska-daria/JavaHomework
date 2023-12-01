package Homework6;

//Заповніть масив розмірності n випадковими цифрами від 0 до
//        33. Знайдіть елемент масиву, який ділиться без остачі на
//        значення елемента зліва і значення елемента справа. Виведіть в
//        консоль значення початкового масиву. Виведіть індекс
//        знайденого елемента. Якщо такий не знайдено,виведіть -1. n —
//        задається з клавіатури

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Homework6_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву");
        int n = sc.nextInt();
        int[] mas = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(34);
        }
        System.out.println(Arrays.toString(mas));

        int index = -1;
        for (int i = 1; i < mas.length - 1; i++) {
            if (mas[i] % mas[i - 1] == 0 && mas[i] % mas[i + 1] == 0) {
                index = i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Індекс Знайденного елемента " + index);
        } else {
            System.out.println("-1");
        }

    }
}