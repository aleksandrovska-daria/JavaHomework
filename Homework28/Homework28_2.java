package Homework28;

import java.io.*;
import java.util.Scanner;

public class Homework28_2 {
    
//    Завдання 4:
//Користувач вводить з клавіатури шлях до файлу, Після роботи
//програми на екрані відображається кількість літер, чисел і
//розділових знаків у файлі.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву файлу");
        String fileName = scanner.nextLine();
        String file = homework28_2(fileName);

        int letterAmount = 0;
        int digitAmount = 0;
        int punctuationAmount = 0;

        for (char ch : file.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterAmount++;
            } else if (Character.isDigit(ch)) {
                digitAmount++;
            } else if (Character.isWhitespace(ch)) {
            } else {
                punctuationAmount++;
            }
        }
        
        System.out.println("Кількість літер у файлі =" + letterAmount);
        System.out.println("Кількість цифр у файлі =" + digitAmount);
        System.out.println("Кількість розділових знаків у файлі =" + punctuationAmount);
    }

    private static String homework28_2(String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            int length = 1024;
            char[] buf = new char[length];
            int charRead = reader.read(buf, 0, length);
            if (charRead != -1) {
                return new String(buf, 0, charRead);
            } else {
                return "";
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
