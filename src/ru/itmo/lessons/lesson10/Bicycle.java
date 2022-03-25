package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Repare;
import ru.itmo.lessons.lesson10.base.Transport;

public class Bicycle extends Transport  implements Repare {
    private String typeBicycle;
public Bicycle( String color,  String manufacturerCompany, int condition, String typeBicycle){
    super(color, manufacturerCompany, condition);
}
@Override
public void repare(){
    setCondition(1);
}

    @Override
    public String toString() {
        return "Bicycle{" +
                "typeBicycle='" + typeBicycle + '\'' +
                '}';
    }
}
