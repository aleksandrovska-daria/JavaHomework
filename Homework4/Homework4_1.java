package Homework4;

import java.util.Scanner;
public class Homework4_1 {
    //Користувач вводить з клавіатури деякі числа (a, b, c),
    // вивести на екран всі числа які є одночасно кратними числам (a, b, c)
    // з діапазону від 0 до 100000.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть a");
        int a = sc.nextInt();
        System.out.println("Введіть b");
        int b = sc.nextInt();
        System.out.println("Введіть c");
        int c = sc.nextInt();

        for(int i = 0; i < 100000; i++) {
            if (i % a == 0 && i % b == 0 && i % c ==0){
                System.out.println("Числа які є одночасно кратними числам (a, b, c) " + i);
            }
        }

    }
}
