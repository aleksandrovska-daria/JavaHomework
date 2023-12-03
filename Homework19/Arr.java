//Завдання 1: Створіть шаблонний клас Array,
//        який являє собою масив,
//        в якому зберігаються об'єкти заданого типу.
//        Реалізуйте:
//        1 заповнення масиву з клавіатури;
//        2 заповнення масиву випадковими числами;
//        3 відображення масиву;
//        4 пошук максимального значення;
//        5 пошук мінімального значення;
//        6 підрахунок середнього арифметичного значення.
//        7* сортування масиву за зростанням;
//        8* сортування масиву за спаданням;
//        9* пошук значення в масиві, використовуючи бінарний пошук;
//        10* заміну значення в масиві на нове значення.
//        Виконати пункти з 3-6.

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public  class Arr<T extends Number> {
    public static class MyArray<T extends Number> {
        T[] arr;
        public void fillKeyBoardArr(Class<T> clazz) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть розмір масиву");
            int size = scanner.nextInt();
            arr = (T[]) Array.newInstance(clazz, size);
            System.out.println("Введіть числа через Enter");
            for (int i = 0; i < arr.length; i++) {
                Object tmp = null;
                if (clazz.isAssignableFrom(Integer.class)) {
                    tmp = scanner.nextInt();
                } else if (clazz == Double.class) {
                    tmp = scanner.nextDouble();
                }
                arr[i] = clazz.cast(tmp);
            }
        }

        public void fillRandomArr(Class<T> clazz, int size) {
            Random random = new Random();
            arr = (T[]) Array.newInstance(clazz, size);
            for (int i = 0; i < size; i++) {
                if (clazz == Integer.class) {
                    Array.set(arr, i, random.nextInt(-100, 100));
                } else if (clazz == Double.class) {
                    Array.set(arr, i, random.nextDouble());
                }
            }
        }

        public void displayArray() {
            for (T elements : arr) {
                System.out.print(elements + " ");

            }
        }

        public T maxValue() {
            T max = arr[0];
            for (T elements : arr) {
                if (elements.doubleValue()> max.doubleValue()) {
                    max = elements;
                }
            }
            System.out.println(max);
            return max;
        }
        public T minValue() {
            T min = arr[0];
            for (T elements : arr) {
                if (elements.doubleValue()< min.doubleValue()) {
                    min = elements;
                }
            }return min;
        }

        public static <T extends Number & Comparable<T>> T maxValueCompare(T[] arr) {

            T max = arr[0];
            for (T elements : arr) {
                if (elements.compareTo(max) > 0) {
                    max = elements;
                }
            }
            System.out.println(max);
            return max;
        }
        public static <T extends Number & Comparable<T>> T minValueCompare(T[] arr) {
            T min = arr[0];
            for (T elements : arr) {
                if (elements.compareTo(min)< 0) {
                    min = elements;
                }
            }return min;
        }
        public double average(){
            double sum = 0;
            for (T elements : arr) {
                sum = sum+ elements.doubleValue();
            }
            double averege = Math.round(sum / arr.length);
            return averege;
        }
    }
}