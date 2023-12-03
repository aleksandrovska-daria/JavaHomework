package Homework21;

public class PhillipsCoffeeMachine extends CoffeeMachine{

    public PhillipsCoffeeMachine() {
        super(3000, 700, 2400);
    }
    public PhillipsCoffeeMachine(int currentWaterLevel, int currentCoffeeLevel, int currentGarbageLevel) {
        super(currentWaterLevel, currentCoffeeLevel, currentGarbageLevel);
    }

    @Override
    public void addWater() {
    }
    @Override
    public void addCoffee() {
    }
}