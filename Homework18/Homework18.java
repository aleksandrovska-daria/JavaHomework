package Homework18;

import java.util.Arrays;

public class Homework18 {

    // Программа должна выводить на экран список студентов
    // группы указывая в строчку через пробел фамилию, год
    // рождения, три оценки и средний бал.
    // Необходимо разработать систему классов для реализации программы.
    // Для хранения информации о студенте создайте класс Student.
    public static void main(String[] args) {

        System.out.println("Прізвище Датанародж    Оцінки   Середній бал ");
        Marks18 marks1 = new Marks18(new int[]{12, 9, 10});
        NameStudent18 student1 = new NameStudent18("Сидорчук", "02.10.2004", marks1);
        student1.show();
        System.out.println();

        Marks18 marks2 = new Marks18(new int[]{10, 8, 11});
        NameStudent18 student2 = new NameStudent18("Федоренко", "05.02.2005", marks2);
        student2.show();
        System.out.println();

        Marks18 marks3 = new Marks18(new int[]{11, 6, 10});
        NameStudent18 student3 = new NameStudent18("Рудий", "24.09.2005", marks3);
        student3.show();

    }
}
