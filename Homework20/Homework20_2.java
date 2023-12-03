package Homework20;

import java.util.Scanner;

public class Homework20_2 {

//    Створіть клас для розрахунку площі геометричних фігур. Клас
//    має надавати функціональність для підрахунку площі трикутника
//    за різними формулами, площі прямокутника, площі квадрата,
//    площі ромба. Методи класу для підрахунку площі реалізуйте за
//    допомогою статичних методів. Також клас має розрахувати
//    кількість підрахунків площі та повернути це значення статичним
//    методом.
    public static int count;

    public static double rhombusArea(int d1, int d2) {
        System.out.print("Площа ромбу = ");
        count++;
        return d1 * 0.5 * d2;
    }

    public static double triangleAreas(int h, int a) {
        System.out.println("Введіть номер для якого трикутника потрібно розрахувати площу");
        System.out.println("1 - Довільний, 2 - Прямокутний, 3 - Рівносторонній");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double area = 0;
        if (choice == 1) {
            System.out.print("Площа довільного прямокутника = ");
            count++;
            area = 0.5 * h * a;
        }
        if (choice == 2) {
            System.out.print("Площа прямокутного прямокутника = ");
            count++;
            area = 0.5 * h * a;
        }
        if (choice == 3) {
            System.out.print("Площа рівностороннього прямокутника = ");
            count++;
            area = Math.sqrt(3) * Math.pow(a, 2) / 4;
        } else if (choice > 3) {
            System.out.println("Невірно введені данні");
        }
        return area;
    }

    public static double rectangeArea(int a, int b) {
        System.out.print("Площа прямокутника = ");
        count++;
        return a * b;
    }
    public static double squareArea(int a) {
        System.out.print("Площа квадрату = ");
        count++;
        return Math.pow(a,2);
    }

    public static int getCount() {
        System.out.print("Кількість підрахунків площі = ");
        return count;

    }
}