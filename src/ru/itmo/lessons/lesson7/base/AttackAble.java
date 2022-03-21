package ru.itmo.lessons.lesson7.base;

//  нельзя создать экземпляр
//  Содержит один или несколько методов без реализации и может содержать метод с реализацией,
//  но он обязательно должен быть default методом
//  Аналог абстрактного метода rest  из класса King.
public interface AttackAble {
    // public перед методом без реализации можно не писать !!!
    public void attack(BattleUnit enemy); // можем атаковать только рыцарей и пехотинцев. Короля нет,
    // так как он наследован от Unit

    // ниже метод с реализацией
    default void someVoid(){
        System.out.println("Метод с реализацией");
    }
}
