package ru.itmo.lessons.lesson7.base;

// Unit это родительский или супер класс
// BattleUnit это дочерний и он наследуется от Unit
// методы и свойства наследуются от родителя
// конструкторы не наследуются
// в BattleUnit мы добавляем характеристику очкиАТАКИ
abstract public class BattleUnit extends Unit{
    protected int attackScore;
    public BattleUnit(int healthScore, int attackScore){
        super(healthScore); // вызов конструктора родителя
        if(attackScore < 1){
            throw new IllegalArgumentException("Значение атаки должно быть положительным");
        }
         this.attackScore = attackScore;

    }
    public int getAttackScore(){
        return attackScore;
    }
    public void battleUnitVoid(){
        System.out.println("Метод BattleUnit");
    }
}
