package Homework16;

public class MonthlyRate extends Workers {
    double dailyRate;
    int numberDays;
    String paymentMethod; // Cтавка

    public MonthlyRate(String name, String paymentMethod, double dailyRate, int numberDays) {
        super(name);
        this.dailyRate = dailyRate;
        this.numberDays = numberDays;

    }
    public double salary() {
        return dailyRate * numberDays;
    }
}

