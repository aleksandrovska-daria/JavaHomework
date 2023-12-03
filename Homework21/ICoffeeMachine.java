package Homework21;

public interface  ICoffeeMachine {
    void turnOn();
    void turnOff();

    void makeEspresso();
    void makeAmericano();
    void cleanGarbageBox();
    void addCoffee();
    void addWater();

    void addCoffee(int quantity);

    void addWater(int quantity);
}
