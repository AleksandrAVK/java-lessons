package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Repare;
import ru.itmo.lessons.lesson10.base.Transport;

import java.util.Arrays;

public class Workshop implements Repare {
    Transport[] transportArr = new Transport[15];

    @Override
    public void repare() {
        for (Transport transport : transportArr) {
            if (transport instanceof Repare) {
                ((Repare) transport).repare();
                System.out.println("Ремонт");
            }
        }
    }

    public void changeColor(int ind, String color) {
        System.out.println(color);
        if (ind < transportArr.length - 1 && transportArr[ind] != null){
            transportArr[ind].changeColor(color);
        }
//        for (Transport transport : transportArr) {
//            transport.changeColor(color);
//        }
    }
    public void addTransport(Transport transport){
        for (int i = 0; i < transportArr.length; i++) {
            if(transportArr[i] == (null)){
                transportArr[i] = transport;
                return;
            }
//

        }
    }

    public Transport[] getTransportArr() {
        return transportArr;
    }
    //


}


//    хранит массив транспортных средств (машины, велосипеды, поезда)
//    метод ремонтировать
//    ремонтирует все транспортные средства, которые
//    можно отремонтировать
//    метод перекрасить
//    можно перекрасить любое транспортное средство