package Homework18;

import java.util.Arrays;

public class NameStudent18 {
    String name;
    String dateOfBirth;
    Marks18 marks;

    public NameStudent18(Marks18 marks) { // агрегация
        this.marks = marks;
    }

    public NameStudent18() {
    }

    public NameStudent18(String name, String dateOfBirth, Marks18 marks) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.marks = marks;
    }

    public void show() {
        System.out.print(name + " " + dateOfBirth + " " + Arrays.toString(marks.getMarks()) + " " + marks.avarageMark());
    }
}