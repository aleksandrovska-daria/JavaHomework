package Homework16;

public class RatePerHour extends Workers {
    double hourRate;
    int numberHours;
    String paymentMethod;


    public RatePerHour(String name, String paymentMethod, double hourRate, int numberHours) {
        super(name);
        this.hourRate = hourRate;
        this.numberHours = numberHours;
    }

    public double salary() {
        return hourRate * numberHours;
    }
}

