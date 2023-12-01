package Homework11;

//Напишіть метод, який перевіряє, чи є число простим. Число
//        передається як параметр. Якщо число просте, поверніть з методу
//        true, якщо ні — false.

public class Homework11_6 {
    public static void main(String[] args) {
        usually(89);
    }
    public static int usually(int a) {
        int voi = 0;
        for (int i = 1; i <= a; i++) {
            if (a / i == a || a % i == 0) {
                voi ++;
            }
        }
        if (voi==2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return a;
    }
}