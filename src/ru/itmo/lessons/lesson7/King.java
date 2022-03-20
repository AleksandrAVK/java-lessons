package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.base.Unit;

public class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army = new BattleUnit[25];

    public King(int healthScore) {
        super(healthScore);
    }

    Knight knight = new Knight((int) (10 + Math.random() * 50), (int) (7 + Math.random() * 20));
    Infantry infantry = new Infantry((int) (10 + Math.random() * 50), (int) (7 + Math.random() * 20));

    public void plusGold(int count) {
        gold = gold + count;
    }

    public void minusGold(int count) {
        if ((gold - count) > 0) {
            gold = this.gold - count;
        }
    }

    public void generateArmy() {
        if ((gold - 250) < 0) throw new IllegalArgumentException("Для создания армии надо от 250 единиц золота");

        for (BattleUnit oneUnit : army) {
            for (int i = 0; i < army.length; i += 1) {
                if (i <= 3) {
                    army[i] = knight;
                } else {
                    army[i] = infantry;
                }
            }
        }
        gold = gold - 250;
    }

    public int getBattleUnitsCount() {
        return army.length;
    }

    public void changeUnits() {
        while (army.length < 25 && (gold - 20) > 0) {
            for (int i = 0; i < army.length; i += 1) {
                if (army[i] != null) {
                    army[i] = knight;
                }
            }
        }
    }


}
//
//    Реализовать следующие методы класса King (в файлах лекции):
//
//        plusGold(int count) - увеличивает золото на count, нет ограничений по максимуму.
//        minusGold(int count) - уменьшает золото на count. Если золота у короля меньше count,
//        уменьшения не происходит

//        generateArmy() - создание и наполнение армии боевыми юнитами. Стоимость армии - 250 золота.
//        Если у короля нет достаточного количества золота, армия не может быть создана.
//        Три первых юнита в армии - рыцари (Knight), остальные - пехотинцы ( Infantry).
//        Значения атаки и здоровья задать через Math.random(), здоровье юнитов должно быть в диапазоне [10;50]
//        атаки - [7;20]

//        changeUnits() - заменяет погибших юнитов новыми рыцарями. Стоимость одной замены - 20 золота. Заменять можно,
//        пока у короля хватает золота.
//        getBattleUnitsCount() - возвращает количество живых юнитов в армии