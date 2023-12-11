package Homework24;

import java.util.List;
import java.util.Objects;

public class Homework24_Human {
    private String name;
    private int inn;
    private String city;
    private List<Homework24_Fine> fineList;
    public Homework24_Human() {
    }

    public Homework24_Human(String name, int inn, String city, List<Homework24_Fine> fineList) {
        this.name = name;
        this.inn = inn;
        this.city = city;
        this.fineList = fineList;
    }
    public Homework24_Human(String name, int inn, String city) {
        this.name = name;
        this.inn = inn;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Homework24_Fine> getFineList() {
        return fineList;
    }

    public void setFineList(List<Homework24_Fine> fineList) {
        this.fineList = fineList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework24_Human human = (Homework24_Human) o;
        return inn == human.inn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inn);
    }
}
