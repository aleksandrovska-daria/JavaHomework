package Homework7;

import java.util.Random;

    public class Homework7_6 {

        // Заповніть масив з 10 елементів випадковими числами від -10 до
        //+10. Підрахуйте кількість унікальних значень (що зустрічаються
        //в масиві один раз). Виведіть в консоль значення унікальних
        //елементів та індекси, під якими вони знаходяться в масиві.

        public static void main(String[] args) {

            int[] arr = new int[10];
            Random random = new Random();
            System.out.println("Масив випадкових чисел");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(-10, 11);
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");

            for (int i = 0; i < arr.length; i++) {
                boolean Unique = true;
                for (int j = 0; j < arr.length; j++) {  // Перевіряємо на унікальність елементи
                    if (i != j && arr[i] == arr[j]) {
                        Unique = false;
                    }
                }
                if (Unique) {
                    System.out.println("Значення унікального елемента " + arr[i] + " з індексом " + i);

                }
            }
        }
    }

