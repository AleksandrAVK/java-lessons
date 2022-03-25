package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Transport;

public class Train extends Transport {
    private int numberWagons;
    public Train( String color,  String manufacturerCompany, int condition, String typeBicycle){
        super(color, manufacturerCompany, condition);
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        if (numberWagons < 1) {
            throw new IllegalArgumentException("Значение carNumber должно иметь положительное значение");
        }
        this.numberWagons = numberWagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberWagons=" + numberWagons +
                '}';
    }
}
