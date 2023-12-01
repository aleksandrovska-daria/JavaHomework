package Homework4;

    import java.util.Random;
    import java.util.Scanner;
    public class Homework4_3 {

        //Реалізуйте серію з n ігор "Камінь, ножиці, папір" з комп'ютером.
        // В результаті виведіть статистику: скільки ігор виграв користувач,
        // скільки разів кожного виду ходів було вибрано.
        // Доповніть гру аналізом комп'ютера ваших ходів і вибір найбільш
        // підходящого проти вас ходу.

        public static void main(String[] args) {
            System.out.println("1 - камінь");
            System.out.println("2 - ножниці");
            System.out.println("3 - бумага");

            Random random = new Random();
            Scanner sc = new Scanner(System.in);

            System.out.println("Введіть ваш вибір");
            int userChoice = sc.nextInt();
            int robotChoice = random.nextInt(1,4);

            int robotwins = 0;
            int userwins = 0;
            int nichiy = 0;

            System.out.printf("Комп'ютер вибрав - ");
            switch (robotChoice){
                case 1 -> System.out.println("1 - камінь");
                case 2 -> System.out.println("2 - ножиці");
                case 3 -> System.out.println("3 - бумага");
            }
            System.out.println( "Ви вибрали - " + userChoice);
            if(robotChoice == 1 && userChoice == 2){
                System.out.println("Комп'ютер виграв");
                robotwins++;
            }
            if(robotChoice == 1 && userChoice == 3){
                System.out.println("Ви виграли!");
                userwins++;
            }
            if(robotChoice == 2 && userChoice == 1){
                System.out.println("Ви виграли!");
                userwins++;
            }
            if(robotChoice == 2 && userChoice == 3){
                System.out.println("Комп'ютер виграв");
                robotwins++;
            }
            if(robotChoice == 3 && userChoice == 1){
                System.out.println("Комп'ютер виграв");
                robotwins++;
            }
            if(robotChoice == 3 && userChoice == 2){
                System.out.println("Ви виграли! :-)");
                userwins++;
            }
            if(robotChoice == 1 && userChoice ==1
                    || robotChoice == 2 && userChoice == 2
                    || robotChoice == 3 && userChoice ==3){
                System.out.println("Нічия");
                nichiy++;
            }
            System.out.println("----------------");
            System.out.println("АНАЛІЗ ГРИ: ");
            System.out.println("Виграли ви: " + userwins);
            System.out.println("Виграв комп'ютер: " + robotwins);
            System.out.println("Нічиї: " + nichiy);
        }
    }

