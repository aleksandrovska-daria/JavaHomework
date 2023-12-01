package Homework;
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int choice = scanner.nextInt();
       switch (choice){
            case 1 -> System.out.println("Понеділок");
            case 2 -> System.out.println("Вівторок");
            case 3 -> System.out.println("Середа");
            case 4 -> System.out.println("Четвер");
            case 5 -> System.out.println("П'ятниця");
            case 6 -> System.out.println("Субота");
            case 7 -> System.out.println("Неділя");
            default -> System.out.println("Неправильно введений день");
        };

        System.out.println(choice);
    }
}

