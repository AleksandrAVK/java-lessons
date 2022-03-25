package ru.itmo.lessons.lesson9;


//  все классы наследуются от Object
// всегдf надо писать implements Cloneable  если собираемся клонировать родителя через метод clone
// через такой вот синтаксис super.clone()
public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x,int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // также можно сравнить через infantryof

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
// переопределяем метод  clone(). Если в родителе только примитивы мы можем обратится к методу клон
// родителя через супер но для этого надо родителю через имплементс добаваить интерфейс клонэйбл

    @Override
    public  Point clone() {
        try{
            return (Point) super.clone(); // возвращаем текущую копию обьекта так как внутри есть примитивы.
            // если это ссылочный тип обьекта, тогда super.clone() делать нельзя, так как все копии будут
            // ссылаться на один обьект. Тут копируется примитивы и ссылки на этот обьект в другой обьект
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }







    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
