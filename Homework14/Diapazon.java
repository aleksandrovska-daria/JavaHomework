package Homework14;

import java.util.Scanner;

    public class Diapazon {
        int n;
        int a;
        int b;
        int lenght;

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getLenght() {
            return lenght;
        }

        public void setLenght(int lenght) {
            this.lenght = lenght;
        }

        public void enterDiapazon() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Введіть кількість n діапазонів ");
            int n = sc.nextInt();

            Size[] ntimes = new Size[n];

            for (int i = 0; i < n; i++) {

                System.out.println("Введіть початкову точку a діапазону ");
                a = sc.nextInt();

                System.out.println("Введіть кінцеву точку b діапазону ");
                b = sc.nextInt();
                ntimes[i] = new Size(a, b);

                if (a > b) {
                    System.out.println("Помилкові дані. Спробуйте ще.");
                } else {
                    lenght = b - a;
                    System.out.println("Довжина діапазону " + lenght);

                }
            }
        }


    }

