package Homework9;

import java.util.Scanner;

public class Homework9_7 {

    // Користувач вводить з клавіатури будь-який рядок. Змініть у
    //початковому рядку всі великі літери на маленькі, а маленькі —
    //великими. Якщо в рядку є цифри, замініть їх на символи
    //підкреслення, і виведіть результат у консоль.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рядок");

        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isUpperCase(ch)) {
                chars[i] = Character.toLowerCase(ch);
            }
            if (Character.isLowerCase(ch)) {
                chars[i] = Character.toUpperCase(ch);
            }
            if (Character.isDigit(chars[i])) {
                chars[i] = '_';
            }
        }
        System.out.println(chars);
    }
}
