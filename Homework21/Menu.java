package Homework21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

// Домашня робота №22
    
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean repeatMenu = true;

        while (repeatMenu) {
            try {
                System.out.println("======== Hello ========");
                System.out.println("Виберіть кавомашину для приготування кави");
                System.out.println("1. Phillips");
                System.out.println("2. Siemens");
                System.out.println("0. Вихід");


                //==== Завдання ====
                //=== 1 додати обробку InputMismatchException через try catch ===
                //=== 2 додати цикл для можливості повтору меню ===

                int machineChoice = scanner.nextInt();
                CoffeeMachine selectMachine = null;
                boolean isSelectMachine = false;


                //обрати кавомашину
                switch (machineChoice) {
                    case 1 -> {
                        selectMachine = new PhillipsCoffeeMachine();
                        isSelectMachine = true;
                    }
                    case 2 -> {
                        selectMachine = new SiemensCoffeeMachine();
                        isSelectMachine = true;
                    }
                    case 0 -> {
                        System.out.println("Good bye");
                        repeatMenu = false;
                    }
                }


                if (isSelectMachine) {
                    boolean repeatOperation = true;
                    while (repeatOperation) {
                        try {
                            //обрати операцію
                            System.out.println("Оберіть операцію");
                            System.out.println("1 - Увімкнути");
                            System.out.println("2 - Вимкнути");
                            System.out.println("3 - Еспрессо");
                            System.out.println("4 - Амерікано");
                            System.out.println("5 - Додати воду");
                            System.out.println("6 - Додати каву");
                            System.out.println("7 - Очистити бак");
                            System.out.println("0 - Вихід");


                            //=== 3 додати обробку InputMismatchException через try catch ===
                            //=== 4 додати цикл для можливості повтору меню ===
                            int choice = scanner.nextInt();


                            //=== 5 пропищіть виклик всіх необхідних методів ===
                            switch (choice) {
                                case 1 -> selectMachine.turnOn();
                                case 2 -> selectMachine.turnOff();
                                case 3 -> selectMachine.makeEspresso();
                                case 4 -> selectMachine.makeAmericano();
                                case 5 -> selectMachine.addWater();
                                case 6 -> selectMachine.addCoffee();
                                case 7 -> selectMachine.cleanGarbageBox();
                                case 0 -> {
                                    System.out.println("Good bye");
                                    repeatMenu = false;
                                    repeatOperation = false;
                                }
                                default ->  System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");

                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");
                            scanner.nextLine();
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Помилка введення. Повторіть спробу. Оберіть цифри зі списку.");
                scanner.nextLine();
            }
        }
    }
}
