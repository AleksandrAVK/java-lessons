package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;

// Есть персонажи:
// Король и у него есть 1) Здоровье 2) Золото 3) армия
// Рыцарь и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительное здоровье
// Пехотинец и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительная атака

public final class Knight extends BattleUnit  {
    private int additionalHealth = 10;

    public Knight(int healthScore, int attackScore) {
        super(healthScore, attackScore);

    }

    public void knightVoid() {
        System.out.println("Метод knightVoid");
    }

    // реализация абстрактного метода
    @Override
    public void rest() {
        plusHealth(3);
        System.out.println("Отдых рыцаря");
    }


    @Override
    public void attack(BattleUnit enemy) {
        if(enemy.isAlive() && this.isAlive()) enemy.minusHealth(attackScore);
        if(enemy.isAlive() ) this.minusHealth( enemy.getHealthScore());
        if(this.isAlive()) this.plusHealth((int)(Math.random() * additionalHealth));
    }
}