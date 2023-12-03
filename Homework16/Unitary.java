package Homework16;

import Homework14.Size;

import java.util.Scanner;
public class Unitary extends Workers {
    int numberTask;
    double amount;
    String paymentMethod;

    public Unitary(String name, String paymentMethod, int numberTask, double amount) {
        super(name);
        this.numberTask = numberTask;
        this.amount = amount;
    }

//    public void numberTask() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введіть кількість завдань");
//        int numberTask = sc.nextInt();
//        double amount;
//        numberTask = sc.nextInt();
//        for (int i = 0; i < numberTask; i++) {
//            System.out.println("Введіть сумму за це завдання");
//            amount = sc.nextInt();
//            amount++;
//        }
//    }

    public double salary() {
        return amount++;
    }

}
