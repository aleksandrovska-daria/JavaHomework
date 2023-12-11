package Homework24;

import java.util.*;

public class Homework_Menu {
    Homework24_Fine fine = new Homework24_Fine("За парковку");
    Homework24_Fine fine2 = new Homework24_Fine("За несплату податків");
    Homework24_Fine fine3 = new Homework24_Fine("За порушення коменданської години");
    Homework24_Fine fine4 = new Homework24_Fine("За порушення тиші");

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть дію");
        Set<Homework24_Human> hmSet = new HashSet<>();
        hmSet.add(new Homework24_Human("Віктор", 123, "Київ", new ArrayList<Homework24_Fine>(List.of(fine3, fine4))));
        while (true) {
            System.out.println("1 Повний друк бази даних.");
            System.out.println("2 Друк даних за вказаним кодом.");
            System.out.println("3 Друк даних за певним типом штрафу.");
            System.out.println("4 Друк даних за вказаним містом.");
            System.out.println("5 Додавання нової людини з інформацією про неї.");
            System.out.println("6 Додавання нових штрафів для вже існуючого запису.");
            System.out.println("7 Видалення штрафу.");
            System.out.println("8 Заміна інформації про людину та її штрафи.");
            System.out.println("0 Вихід.");


            int choice = scanner.nextInt();
            boolean check = true;
            switch (choice) {
                case 1 -> show(hmSet);
                case 2 -> checkByCod(hmSet, scanner);
                case 3 -> checkByFine(hmSet, scanner);
                case 4 -> checkByCity(hmSet, scanner);
                case 5 -> add(hmSet, scanner);
                case 6 -> addNewFine(hmSet, scanner);
                case 8->replaceInfoHuman(hmSet, scanner);
                case 0 -> {
                    System.out.println("Программа закривається");
                    check = false;
                }
            }
        }
    }

    public void show(Set<Homework24_Human> hmSet) {
        for (Homework24_Human hmList : hmSet) {
            System.out.println("Ім'я = " + hmList.getName());
            System.out.println("Інд.код = " + hmList.getInn());
            System.out.println("Місто = " + hmList.getCity());
            System.out.println("Штрафи = " + hmList.getFineList());
        }
    }

    public void checkByCod(Set<Homework24_Human> hm, Scanner scanner) {
        System.out.println("Пошук людини за колом");
        System.out.println("Введіть код людини");
        int cod = scanner.nextInt();
        for (Homework24_Human check : hm) {
            if (check.getInn() == cod) {
                System.out.println("Ім'я = " + check.getName());
                System.out.println("Інд.код = " + check.getInn());
                System.out.println("Місто = " + check.getCity());
                System.out.println("Штрафи = " + check.getFineList());
            } else {
                System.out.println("Не існує");
            }
            return;
        }
    }

    public void checkByFine(Set<Homework24_Human> hm, Scanner scanner) {
        System.out.println("Список людей по штафу");
        System.out.println("Введіть номер штрафу \n  1 = за парковку\n 2 = за несплату податків\n" +
                "3 = за вигул собаки\n  4 = за порушення тиші");
        int fine = scanner.nextInt();
        switch (fine) {
            case 1 -> {
                for (Homework24_Human check : hm) {
                    if (check.getFineList().contains(this.fine)) {
                        System.out.println("Ім'я = " + check.getName());
                        System.out.println("Інд.код = " + check.getInn());
                        System.out.println("Місто = " + check.getCity());
                        System.out.println("Штрафи = " + check.getFineList());
                    }
                }
            }
            case 2 -> {
                for (Homework24_Human check : hm) {
                    if (check.getFineList().contains(this.fine2)) {
                        System.out.println("Ім'я = " + check.getName());
                        System.out.println("Інд.код = " + check.getInn());
                        System.out.println("Місто = " + check.getCity());
                        System.out.println("Штрафи = " + check.getFineList());
                    }
                }
            }
            case 3 -> {
                for (Homework24_Human check : hm) {
                    if (check.getFineList().contains(this.fine3)) {
                        System.out.println("Ім'я = " + check.getName());
                        System.out.println("Інд.код = " + check.getInn());
                        System.out.println("Місто = " + check.getCity());
                        System.out.println("Штрафи = " + check.getFineList());
                    }
                }
            }
            case 4 -> {
                for (Homework24_Human check : hm) {
                    if (check.getFineList().contains(this.fine4)) {
                        System.out.println("Ім'я = " + check.getName());
                        System.out.println("Інд.код = " + check.getInn());
                        System.out.println("Місто = " + check.getCity());
                        System.out.println("Штрафи = " + check.getFineList());
                    }
                }
            }
        }
    }

    public void add(Set<Homework24_Human> hm, Scanner scanner) {
        System.out.println("Додати нову людину");
        System.out.println("Введіть ім'я");
        String nameN = scanner.next();
        System.out.println("Введіть ідентифікаційний код");
        int cod = scanner.nextInt();
        System.out.println("Введіть місто");
        String city = scanner.next();
        Homework24_Human list = new Homework24_Human(nameN, cod, city);
        hm.add(list);
    }

    public void checkByCity(Set<Homework24_Human> hm, Scanner scanner) {
        System.out.println("Введіть назву міста, щоб побачити список людей");
        String city = scanner.next();
        for (Homework24_Human check : hm) {
            if (check.getCity().toLowerCase().equals(city)) {
                System.out.println("Ім'я = " + check.getName());
                System.out.println("Інд.код = " + check.getInn());
                System.out.println("Місто = " + check.getCity());
                System.out.println("Штрафи = " + check.getFineList());
            } else {
                System.out.println("Не існує");
            }
            return;
        }
    }

    public void addNewFine(Set<Homework24_Human> hm, Scanner scanner) {
        System.out.println("Введіть ідентифікаційний код людини, якій додати штраф");
        int cod = scanner.nextInt();
        int cod1;
        for (Homework24_Human ind : hm) {
            if (ind.getInn() == cod) {
                System.out.println("Введіть номер штрафу,який потрібно добавити до людини\\n  1 = за парковку\\" +
                        "n 2 = за несплату податків\\n\" +\n" +
                        "\"3 = за вигул собаки\\n  4 = за порушення тиші\");");
                cod1 = scanner.nextInt();
                switch (cod1) {
                    case 1 -> {

                    }
                    case 2 -> {
                        ind.setFineList((List<Homework24_Fine>) this.fine2);
                    }
                    case 3 -> {
                        ind.setFineList((List<Homework24_Fine>) this.fine3);
                    }
                    case 4 -> {
                        ind.setFineList((List<Homework24_Fine>) this.fine4);
                    }
                }

            } else {
                System.out.println("Нікого не знайдено");
            }
            return;
        }
    }
    public void replaceInfoHuman(Set<Homework24_Human> hm, Scanner scanner){
        System.out.println("Введіть ідентифікаційний код людини, для якої потрбно змінити інформацію");
        int cod=scanner.nextInt();
        String name;
        int cod2;
        String city;
        for (Homework24_Human replace:hm) {
            if (replace.getInn()==cod){
                System.out.println("Введіть нове ім'я");
                name=scanner.next();
                System.out.println("Введіть новий ідентифікаційний код");
                cod2=scanner.nextInt();
                System.out.println("Введіть нове місто");
                city=scanner.next();
                replace.setName(name);
                replace.setInn(cod2);
                replace.setCity(city);
            }else{
                System.out.println("Нікого не знайдено");
            }
            return;
        }

    }
}
