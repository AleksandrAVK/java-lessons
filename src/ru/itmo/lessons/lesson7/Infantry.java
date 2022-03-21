package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;
// Есть персонажи:
// Король и у него есть 1) Здоровье 2) Золото 3) армия
// Рыцарь и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительное здоровье
// Пехотинец и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительная атака
public class Infantry  extends BattleUnit  {
    // благодаря final мы не сможем изменить значение additionalAttack в будущем.
    // Значение можно задать только при обьявлении переменной или обьявить без значения и потом
    // через конструктор можно задать значение только один раз.
    // В сеттерах изменить нельзя.
private  final int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore){
        super( healthScore, attackScore);
    }
    public void infantryVoid(){
        System.out.println("Метод infantryVoid");
    }

    // Переопределение метода родителя
    // полностью повторяем все как у родителя,тип данных, название, как у родителя кроме модификатора
    // модификатор может быть таким же или выше. Самый высокий public --> потом private ---> потом protected.
    // Теперь можем менять инструкции родителя полностью и задавать свои для данного класса.
    // Если надо сохранить инструкции родителя и добавить свои, тогда вызываем super.
    @Override
    public boolean runFromField() {
        if (super.runFromField()) {
            // добавляем наши инструкции к инструкциям родителя
            attackScore -= 3;
            System.out.println("После бегства атака уменьшена на 3");
            return true;
        }
        return  false;
    }


    // реализация абстрактного метода
    @Override
    public void rest() {
       plusHealth(1);
        System.out.println("Отдых пехотинца");
    }

    @Override
    public void attack(BattleUnit enemy) {
        if(enemy.isAlive() && this.isAlive()) enemy.minusHealth(attackScore);
        if(enemy.isAlive() ) this.minusHealth( enemy.getHealthScore());
        if(this.isAlive()) this.plusHealth((int)(Math.random() * additionalAttack));
    }
}
