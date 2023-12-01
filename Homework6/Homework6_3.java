package Homework6;

public class Homework6_3 {

        //Напишіть програму, яка перевіряє, чи всі значення елементів
        //масиву однакові. Виведіть: Yes — якщо всі однакові, і No — якщо
        //є хоч одна відмінність. Задайте та ініціалізуйте масив на початку
        //програми.

        public static void main(String[] args) {
            int[] arr = {5, 5, 5, 5, 5, 5};
            boolean allEquals = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] != arr[i]) {
                    allEquals = false;
                }
            }
            if (allEquals) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

