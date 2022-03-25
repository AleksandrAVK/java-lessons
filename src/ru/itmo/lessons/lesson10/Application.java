package ru.itmo.lessons.lesson10;


import ru.itmo.lessons.lesson10.base.Transport;
import ru.itmo.lessons.lesson10.Workshop;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Transport car= new Car("синий", "MacLaren",10,777);
        Transport bicycle = new Bicycle("Красный", "Bentley",10,"Bentley Bicyle");
        Transport train = new Train("Розовый", "Заводы Росии", 10, "Super Train");

        Workshop workshop = new Workshop();

        workshop.addTransport(car);
        workshop.addTransport(bicycle);
        workshop.addTransport(train);

        workshop.repare();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Индекс");
        int transportIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Цвет");
        String color = scanner.nextLine();
        workshop.changeColor(transportIndex, color);

        System.out.println(Arrays.toString(workshop.getTransportArr()));
    }
}


//    Машина
//    цвет (строка)
//    компания производитель (строка)
//    состояние - целое число от 1 до 10
//            номер
//            метод ремонт - увеличение состояния на 2
//            метод сменить цвет
//            Велосипед
//            цвет (строка)
//            компания производитель (строка)
//            состояние - целое число от 1 до 10
//            тип (например, городской, дорожный, горный и тд)
//            метод ремонт - увеличение состояния на 1
//            метод сменить цвет
//            Поезд
//            цвет (строка)
//            компания производитель (строка)
//            состояние - целое число от 1 до 10
//            количество вагонов (целое число)
//            метод сменить цвет
//            поезд отремонтировать нельзя
//
//            Мастерская
//            хранит массив транспортных средств (машины, велосипеды, поезда)
//            метод ремонтировать
//            ремонтирует все транспортные средства, которые
//            можно отремонтировать
//            метод перекрасить
//            можно перекрасить любое транспортное средство