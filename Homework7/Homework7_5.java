package Homework7;


    import java.util.Random;

    public class Homework7_5 {

        //Заповніть масив з 10 елементів випадковими числами від -10 до
        //+10. Підрахуйте кількість повторюваних значень. Виведіть в
        //консоль тільки повторювані елементи і кількість повторень.

        public static void main(String[] args) {
            int[] arr = new int[10];
            Random random = new Random();
            System.out.println("Масив випадкових чисел\n");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(-10, 11);
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        count++;
                    } else {
                        continue;
                    }
                }
                if (count > 0) {
                    System.out.println("Число " + arr[i] + " повторюється " + (count + 1) + " раза");

                }
            }
        }
    }

