package Homework4;

    import java.util.Scanner;

    public class Homework4_2 {

        //Напишіть програму, яка перевірятиме, чи є введене число з клавіатури,
        // паліндромом (яке можна однаково прочитати в обох напрямках). Наприклад,
        // 123454321 або 221122 — паліндром. Програма має вивести YES, якщо число
        // є паліндромом, і NO якщо число не паліндром.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть число");
            int palindrom = sc.nextInt();
            System.out.println(palindrom);

            int copypal = palindrom; // копія нашого числа
            int changepal = 0; // інвертуєме число, зберігає обернене число (з числами в оберненому порядку)
            int lastdigital; // виділяє останне число

            while (palindrom > 0) {
                lastdigital = palindrom % 10;
                changepal = changepal * 10 + lastdigital;
                palindrom /= 10;
            }

            if (copypal == changepal) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
       }
    }
