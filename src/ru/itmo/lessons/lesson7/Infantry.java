package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
// Есть персонажи:
// Король и у него есть 1) Здоровье 2) Золото 3) армия
// Рыцарь и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительное здоровье
// Пехотинец и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительная атака
public class Infantry  extends BattleUnit {

private  int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore){
        super( healthScore, attackScore);
    }
    public void infantryVoid(){
        System.out.println("Метод infantryVoid");
    }

}
