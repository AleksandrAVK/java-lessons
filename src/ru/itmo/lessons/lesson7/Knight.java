package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;

// Есть персонажи:
// Король и у него есть 1) Здоровье 2) Золото 3) армия
// Рыцарь и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительное здоровье
// Пехотинец и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительная атака

public class Knight extends BattleUnit {
    private int additionalHealth = 10;
    public Knight(int healthScore, int attackScore){
        super( healthScore,attackScore);

    }
    public void knightVoid(){
        System.out.println("Метод knightVoid");
    }
}
