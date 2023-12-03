package Homework20;

public class Homework20_3 {

//    Створіть клас для підрахунку максимуму з чотирьох аргументів,
//    мінімуму з чотирьох аргументів, середнє арифметичне із
//    чотирьох аргументів, факторіалу аргументу. Функціональність
//    треба реалізувати у вигляді статичних методів.
    public static double maxValue(int a, int b, int c, int d) {
        System.out.print("Максимум = ");
        return Math.max(Math.max(a, b), Math.max(c, d)) ;
    }
    public static double minValue(int a, int b, int c, int d) {
        System.out.print("Мінімум = ");
        return Math.min(Math.min(a, b), Math.min(c, d)) ;
    }
    public static double average(int a, int b, int c, int d) {
        System.out.print("Середнє арифметичне = ");
        return (double) (a + b + c + d) /4;
    }
    public static double factorial(int f) {
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
        }
        System.out.print("Факторіал = ");
        return  factorial;
    }
}