package Homework11;

//Напишіть метод, який повертає максимальне з чотирьох чисел.
//        Числа передаються як параметри.

public class Homework11_4 {
    public static void main(String[] args) {
        max(29,45,45,98);
    }
    public static int max(int a,int b, int c , int d){

        int max = Math.max(a,b);
        int max1 = Math.max(c,d);
        int max2 = Math.max(max,max1);
        System.out.println(max2);
        return max2;
    }
}