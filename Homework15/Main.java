package Homework15;

//Завдання 3
// Створіть клас Money (Гроші) для роботи з грошовими сумами.
// Число має бути представлене двома полями:
//  типу long – для гривень;
//  типу byte – для копійок.
// Реалізуйте виведення значення на екран,
// при цьому дробова частина має бути відокремлена комою від цілої частини.
// Реалізуйте
// додавання,
// віднімання,
// ділення сум,
// *ділення суми на дробове число,
// *множення на дробове число
// та операції порівняння.
public class Main {
    public static void main(String[] args) {
        Money mn = new Money(20L, (byte) 50);
        mn.show();
        mn.add(5L, (byte) 60);
        mn.show();
        mn.sub(12L, (byte) 80);
        mn.show();
        mn.division(2);
        mn.show();
        mn.comparison(6L,(byte) 65);

    }
}