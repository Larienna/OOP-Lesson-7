package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Worker {

    private String fullName;
    private String position;
    private int startYear;

    public Worker(String fullName, String position, int startYear) {
        this.fullName = fullName;
        this.position = position;
        this.startYear = startYear;
    }
    // геттеры и сеттеры для полей класса
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }


}

