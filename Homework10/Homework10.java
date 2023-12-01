package Homework10;

import java.util.Arrays;
import java.util.Scanner;

    public class Homework10 {
        // Напишіть програму, яка перевіряє, чи є один рядок анаграмою
        //для іншого рядка (рядок може складатися з кількох слів і
        //символів пунктуації). Ігноруйте пробіли і пунктуацію під час
        //аналізу. Різниця у великих і маленьких літерах має ігноруватися.
        //Обидва рядка мають вводитися з клавіатури. Програма має
        //виводити Yes, якщо рядки є анаграмою, і No — якщо навпаки.
        //Приклад анаграми у віршах:
        //Рядок 1 “Я не лев!” – левеня;
        //Рядок 2 “Я не лис!” – лисеня.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть рядок 1: ");
            String str1 = sc.nextLine();

            System.out.println("Введіть рядок 2: ");
            String str2 = sc.nextLine();

            str1 = str1.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
            str2 = str2.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            if(Arrays.equals(str1Array, str2Array)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

