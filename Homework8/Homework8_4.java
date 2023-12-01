package Homework8;

    import java.util.Scanner;

    public class Homework8_4 {

        //Користувач вводить з клавіатури рядок. Перевірте, чи є введений
        //рядок паліндромом. Паліндроми — слова, речення або текст, які
        //однаково читаються як зліва направо, так і справа наліво.
        //Наприклад: кок; козак з казок; радар; а мене нема.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть рядок");

            String str = sc.nextLine();
            String reverseStr = "";

            char[] ch = str.toCharArray();

            for (int i = ch.length - 1; i >= 0; i--) {
                reverseStr = reverseStr + ch[i];
            }

            if (str.equals(reverseStr)) {
                System.out.println("Рядок - паліндром");
            } else {
                System.out.println("Рядок - не паліндром");
            }
        }
    }

