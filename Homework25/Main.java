package Homework25;

public class Main {  //Завдання 3:
    // + Реалізуйте базу даних податкової інспекції зі штрафів.
    // + Ідентифікувати кожну людину буде персональний ідентифікаційний код.
    // + В однієї людини може бути багато штрафів.
    // Реалізуйте:
    // + 1. Повний друк бази даних.
    // + 2. Друк даних за вказаним кодом.
    // + 3*. Друк даних за певним типом штрафу.
    // - 4. Друк даних за вказаним містом.
    // - 5. Додавання нової людини з інформацією про неї.
    // - 6*. Додавання нових штрафів для вже існуючого запису.
    // - 7*. Видалення штрафу.
    // - 8. Заміна інформації про людину та її штрафи.
    public static void main(String[] args) {

        LogicDataBase logicDataBase = new LogicDataBase();
        logicDataBase.logicDB();

    }
}
