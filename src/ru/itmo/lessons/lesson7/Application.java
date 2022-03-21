package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//public class Knight extends BattleUnit
//public class Infantry extends BattleUnit
// public class King extends Unit
public class Application {
    public static void main(String[] args) {
        Knight knight1 = new Knight(20, 17);
        knight1.knightVoid();
        knight1.runFromField();

        BattleUnit knight2 = new Knight(20, 17);
        knight2.battleUnitVoid();

        Unit knight3 = new Knight(20, 17);
        knight3.plusHealth(40);

        Infantry infantry1 = new Infantry(18, 15);
        infantry1.runFromField();


//        Полиморфный юнит. Полиморфизм наследования
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите тип персонажа");
        String type = in.nextLine();
        BattleUnit battleUnit = null;
        if(type.equalsIgnoreCase("Рыцарь")){
            battleUnit = new Knight(10,50);
        } else if(type.equalsIgnoreCase("Пехотинец")){
            battleUnit = new Infantry(10,50);
        }
        //  в зависимости от выбора пользователя метод rest сработает на одном из персонажей
        //  Это аморфное наследование.
        battleUnit.attack(knight1);






    }

//    final означает, что нельзя создать потомка через  extends
//    abstract  означает, что нельзя создать экземпляр класса
//    ( например через  оператора Infantry infantre = new Infantry) --- вот так не получится
//    Если класс абстрактный, тогда делать реализацию абстракного метода не надо


 //   методы обычно бывают static если они вспомогательные и обслуживающие как например Math() и
    //   если функционал по созданию обьекта выносится в отдельный метод (напрмер метод генерации боевых методов)
    // Для обращения к статическому методу создавать обьект не надо.
    // Статические методы это не возможности обьекта
    // Достаточно обратится к классу и через точку к его методу.
    // Например Math.max() Тут мы обращаемся к статическому методу который находится в классе Math


    // Фабричные методы это статические методы которые создают экземпляры класса
}


//    }
//}
