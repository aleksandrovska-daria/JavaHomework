package Homework11;

import java.util.Scanner;

//Напишіть метод, який відображає горизонтальну або
//        вертикальну лінію з певного символу. Метод приймає як
//        параметр: довжину лінії, напрям, символ.

public class Homework11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть символ для лінії");
        String simvol = sc.nextLine();

        System.out.println("Введіть довжину лінії");
        int longs = sc.nextInt();

        System.out.println("Введіть напрям 1-горизотально , 2 - вертикально");
        int chose = sc.nextInt();

        switch (chose) {
            case 1:
                gor(longs, simvol);
                break;
            case 2:
                vert(longs, simvol);
                break;
            default:
                System.out.println("На таку цифру дій немає , спробуйте ще :) ");
        }

    }
    public static void vert(int longs, String simvol) {
        for (int i = 0; i < longs; i++) {
            System.out.println(simvol);
        }
    }
    public static void gor(int longs, String simvol) {
        for (int i = 0; i < longs; i++) {
            System.out.print(simvol);
        }
    }
}