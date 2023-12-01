package Homework8;


    import java.util.Scanner;

    public class Homework8_2 {
        //Напишіть програму, яка створить рядок, в якому знаходяться всі
        //цілі числа, починаючи з 1, виписані в один рядок
        //«123456789101112131415...». Рядок має бути довжиною не
        //більше 1 000 символів.
        //За числом n (введеного з клавіатури), виведіть цифру на
        //n-й позиції (використовується нумерація з 1).
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть число n ");

            int n = sc.nextInt();
            int firstNumber = 1;

            String numString = "";

            while (numString.length() < 1000) {
                numString += firstNumber;
                firstNumber++;
            }
            if (numString.length() > 1000) {
                numString = numString.substring(0, 1000); // якщо більше 1000 символів то обрізаємо
            }
            System.out.println("Рядок = " + numString);

            while (numString.length() < n) {
                numString += firstNumber;
                firstNumber++;
            }
            char digit = numString.charAt(n - 1);
            System.out.println("Цифра на " + n + " позиції - " + digit);
            System.out.println(numString.length());
        }
    }

