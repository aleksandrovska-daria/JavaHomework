package Homework12;

public class Homework12_4 {
    public static void main(String[] args) {
        reverse(179);
    }

    public static void reverse(int number) {
        if (number == 0) {
            return;
        } else {
            int n = number % 10 ;
            System.out.print(n+ " ");
            reverse(number / 10);
        }
    }
}