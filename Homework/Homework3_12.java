package Homework;
import java.util.Scanner;

public class Homework3_12 {

        //Програма запитує шестизначне число. Після введення програма
        //визначає, чи буде квиток з таким номером «щасливим» (сума
        //перших трьох цифр збігається із сумою трьох останніх цифр).
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть шестизначне число");
            int num = sc.nextInt();

            int a = num / 100000;
            int b = num / 10000 % 10;
            int c = num / 1000 % 10;
            int d = num / 100 % 10;
            int e = num / 10 % 10;
            int f = num % 10;

            int firstpart = a + b + c;
            int secondpart = d + e + f;

            if (firstpart == secondpart) {
                System.out.println("Щасливий квиток");
            }else {
                System.out.println("Спробуй ще");
            }
        }
    }

