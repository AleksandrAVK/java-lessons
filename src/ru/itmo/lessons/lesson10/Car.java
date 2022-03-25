package ru.itmo.lessons.lesson10;
import ru.itmo.lessons.lesson10.base.Repare;
import ru.itmo.lessons.lesson10.base.Transport;

public class Car extends Transport implements Repare{
    private int carNumber;
    public Car(String color,  String manufacturerCompany, int condition, int carNumber){
        super( color,   manufacturerCompany,  condition);
    }
    @Override
public void repare(){
    setCondition(2);
}

    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                "color=" + getColor() +
                '}';
    }

    public void setCarNumber(int carNumber) {
        if (carNumber < 1) {
            throw new IllegalArgumentException("Значение carNumber должно иметь положительное значение");
        }
        this.carNumber =  carNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }
}
