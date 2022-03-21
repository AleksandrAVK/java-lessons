package ru.itmo.lessons.lesson7.base;
// Есть персонажи:
// Король и у него есть 1) Здоровье 2) Золото 3) армия
// Рыцарь и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительное здоровье
// Пехотинец и у него есть 1) Здоровье 2) ОчкиАТАКИ 3) Дополнительная атака


// ru.itmo.lessons.lesson7.base.Unit
// родительский класс всех персонажей.
// если abstract то нельзя создать экземпляр и он может содержать абстрактные методы
// Сюда выносим общую характеристику здоровье для всех персонажей. Короля, рыцаря и пехотинца.
// Unit мы создали, чтобы хранить общую для всех персонажей информацию о здоровье персонажей

// Unit это родительский или супер класс


abstract public class Unit {
//    protected дает доступ к свойству из самого класса и плюс из дочерних классов (через extended).
//    Из экземпляров доступа нет
    protected int healthScore;
    private int maxHealthScore;
    public Unit(int healthScore){
        if(healthScore < 1){
            throw new IllegalArgumentException("Здоровье должно иметь положительное значение");
        }
        this.healthScore = healthScore;
        maxHealthScore = healthScore;
    }
    //  добавляем здоровье, но не больше изначального(того, что было установлено при создании персонажа)
    //  если персонаж жив
    public void plusHealth(int healthScore){
        if (!isAlive()) return;
        this.healthScore = Math.min(this.healthScore + healthScore, maxHealthScore);
    }
//  уменьшить здоровье на healthScore если персонаж жив
    public void minusHealth(int healthScore){
    if(!isAlive()) return;
    this.healthScore -= healthScore;

    }
    // метод вернет true если здоровье больше ноля
    // вернет false если здоровье меньше ноля
    public boolean isAlive(){
        return this.healthScore > 0;

    }
    public int getHealthScore(){
        return healthScore;
    }

    // абстрактный метод  - метод без реализации(то есть без {} );
    // Без фигурных скобок.Без метода реализации.
    // Тип данных, конфигуратор доступа, название, количество аргументов может быть любым
    // Абстрактный метод может быть только у абстрактного класса.
    // Абстрактный метод у родителя заставляет написать реализацию метода у всех потомков этого класса.

    public abstract void rest();


}
