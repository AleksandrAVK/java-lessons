package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.Infantry;
import ru.itmo.lessons.lesson7.Knight;

import javax.sound.midi.Soundbank;

// Unit это родительский или супер класс
// BattleUnit это дочерний и он наследуется от Unit
// методы и свойства наследуются от родителя
// конструкторы не наследуются
// в BattleUnit мы добавляем характеристику очкиАТАКИ
abstract public class BattleUnit extends Unit implements AttackAble{
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore); // вызов конструктора родителя
        if (attackScore < 1) {
            throw new IllegalArgumentException("Значение атаки должно быть положительным");
        }
        this.attackScore = attackScore;

    }

    public int getAttackScore() {
        return attackScore;
    }

    // нельзя переопределить final метод !!!
    // Не сможем переопределить нигде и в у потомков также нельзя переопределить
    public final void battleUnitVoid() {
        System.out.println("Метод BattleUnit");
    }


    public boolean runFromField() {
        // добавляем наши инструкции.
        // при бегстве с поля боя юнит теряет одну единицу здоровья
        if (!isAlive()) {
            System.out.println("Юнит не может сбежать");
            return false;
        }
        minusHealth(1);
        if (!isAlive()) {
            System.out.println("Юнит не смог сбежать");
            return false;
        }
        return true;

    }
// static  нужен, чтобы не создавать экземпляр класса, а сразу вот так  BattleUnit.getBattleUnit()
// получить доступ к методу. Создавать экземпляр класса и потом на этом экземпляре вызывать метод не надо
    public static BattleUnit getBattleUnit(){
        String [] types = {"knight","infantry" };
        BattleUnit unit = null;
        switch (types[(int) Math.random() * types.length]){
            case "knight":
                unit = new Knight(30,50);
                break;
            case "infantry":
                unit = new Infantry(35,20);
                break;
        }
        return unit;
    }

    public static BattleUnit[] getBattleUnits(int count){
        BattleUnit[] units = new BattleUnit[count];
       for (int i=0; i < units.length; i++){
//            в статических методах можно обратится только к статическим методам или свойствам
           units[i]=getBattleUnit();

        }
       return units;
    }

}