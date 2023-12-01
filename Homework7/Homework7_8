package Homework7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

//Заповніть масив розмірності n випадковими, малими
//        латинськими літерами. Підрахуйте, скільки разів трапляється
//        кожна літера. Виведіть літери, які трапляються більше 3 разів. n
//        — задається з клавіатури.
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву = ");
        int n = sc.nextInt();
        char[] mas = new char[n];
        Random r = new Random();
        String a = "";
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (char) r.nextInt(97, 123);

        }
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            if (!a.contains(String.valueOf(mas[i]))) {
                for (int j = 0; j < mas.length; j++) {
                    if (mas[i] == mas[j]) {
                        count++;
                        a += String.valueOf(mas[i]);
                    }
                }
            } else {
                continue;
            }
            //System.out.println(mas[i] + " Зустрічається = " + count + " разів");

            if (count > 3) {
                System.out.println(mas[i] + " Зустрычається більше трьох разів , а саме ===" + count);
            }
            count = 0;
        }
    }
}
