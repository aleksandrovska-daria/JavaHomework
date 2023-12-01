package Homework9;

import java.util.Scanner;

    public class Homework9_5 {

        // Введіть рядок з клавіатури. Врядку мають бути слова, які можуть
        //бути роздільні пробілами або двокрапками. Обчисліть кількість
        //слів в рядку, в яких парна кількість літер.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть рядок у якому є слова, які розділені пробілами aбо двокрапками ");
            String str = sc.nextLine();

            String[] letters = str.split("[ :]");
            int lettersCount = 0;
            int count = 0;

            for (int i = 0; i < letters.length; i++) {

                if (!letters[i].isBlank()) {
                    System.out.print(letters[i] + " - кількість букв у слові = ");
                    lettersCount = letters[i].length();
                    System.out.println(lettersCount);
                }
                if (lettersCount % 2 == 0) {
                    count++;
                }
            }
            System.out.println("\nКількість,слів в рядку, в яких парна кількість літер = " + count);
        }
    }

