package Homework23;

import java.util.*;

public class Menu_23 {
    //Завдання 2:
    // Розробіть додаток, який дозволяє зберігати інформацію про логіни і паролі користувачів.
    // Кожному користувачу відповідає пара "логін — пароль".
    // При старті додатку відображається меню:
    // 1. Додати нового користувача.
    // 2. Видалити існуючого користувача.
    // 3. Перевірити, чи існує такий користувач.
    // 4. Змінити логін існуючого користувача.
    // 5. Змінити пароль існуючого користувача.
    // Дія виконується залежно від вибору користувача,
    // після чого меню з'являється знову.
    // Для вирішення завдання використовуйте відповідний клас з Java Collections Framework.
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть операцію");
        List<User> users = new ArrayList<>();
        users.add(new User("Petrenko20", "123456P"));
        users.add(new User("Kovalenko07", "65412uu"));
        users.add(new User("Nesterenko55", "1568984Ql1"));

        while (true) {
            System.out.println("1 Додати нового користувача.");
            System.out.println("2 Видалити існуючого користувача.");
            System.out.println("3 Перевірити, чи існує такий користувач.");
            System.out.println("4 Змінити логін існуючого користувача.");
            System.out.println("5 Змінити пароль існуючого користувача.");
            System.out.println("6 Показати всіх користувачів.");
            System.out.println("0 Вихід.");

            int choice = scanner.nextInt();
            boolean isSelect = true;
            switch (choice) {
                case 1 -> add(users, scanner);
                case 2 -> remove(users, scanner);
                case 3 -> check(users, scanner);
                case 4 -> changeLogin(users, scanner);
                case 5 -> changePassword(users, scanner);
                case 6 -> show(users);
                case 0 -> {
                    System.out.println("До побачення");
                    isSelect = false;;
                }
                default ->  System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");

            }
        }
    }

    public static void add(List<User> list, Scanner scanner) {

        System.out.println("Додати нового користувача ");
        System.out.print("Введіть логін: ");
        String login = scanner.next();

        System.out.print("Введіть пароль: ");
        String password = scanner.next();

        User newUser = new User(login, password);
        list.add(newUser);

    }

    public static void remove(List<User> list, Scanner scanner) {
        System.out.println("Видалити існуючого користувача.");
        System.out.println("Введіть логін користувача, якого потрібно видатити");
        list.removeIf(user -> user.getLogin().equals(scanner.next()));

    }

    public static void check(List<User> list, Scanner scanner) {
        System.out.println("Введіть логін користувача, якого потрібно перевірити");
        String login = scanner.next();

        for (User user : list) {
            if (user.getLogin().equals(login)) {
                System.out.println("Такий користувач вже існує.");
            } else {
                System.out.println("Не існує.");
            } return;
        }
    }

    public static void changeLogin(List<User> list, Scanner scanner) {
        System.out.println("Введіть логін користувача, який потрібно змінити");
        String login = scanner.next();
        System.out.println("Введіть новий логін");
        String newLogin = scanner.next();
        for (User user : list) {
            if (user.getLogin().equals(login)) {
                user.setLogin(newLogin);
                return;
            }
        }
    }

    public static void changePassword(List<User> list, Scanner scanner) {
        System.out.println("Введіть логін користувача, який потрібно змінити");
        String login= scanner.next();
        System.out.println("Введіть новий пароль");
        String newPassword = scanner.next();
        for (User user : list) {
            if (user.getLogin().equals(login)) {
                user.setPassword(newPassword);
                return;
            }
        }
    }
    public static void show(List<User> list) {
        for (User user : list) {
            System.out.println("Логін: " + user.getLogin()+ " пароль: " + user.getPassword());
            System.out.println();
        }

    }
}
