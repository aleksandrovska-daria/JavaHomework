package Homework21;

public class SiemensCoffeeMachine extends CoffeeMachine {


    public SiemensCoffeeMachine() {
        super(2000, 500, 2000);
    }

    public SiemensCoffeeMachine(int currentWaterLevel, int currentCoffeeLevel, int currentGarbageLevel) {
        super(currentWaterLevel, currentCoffeeLevel, currentGarbageLevel);
    }
    @Override
    public void addWater() {
    }
    @Override
    public void addCoffee() {
    }
}
