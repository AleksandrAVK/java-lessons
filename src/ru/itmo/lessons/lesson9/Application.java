package ru.itmo.lessons.lesson9;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Point a = new Point(23, -12);
        Point b = new Point(23, -12);
        Point c = new Point(12, 33);
        Point d = new Point(45, 11);
        Point f = new Point(8, 9);
        System.out.println(a);
        System.out.println(b);

        // сравнение ссылок
        System.out.println(a == b); // false

        // по умолчанию метод equals сравнивает ссылки
        // и он должен быть переопределён в классе для этого идём в generate ( alt + insert) и
        // выбираем equals и hashcode и настраиваем, при совпадении каких свойств мы считаем, что обьекты равны
        System.out.println(a.equals(b)); // true

        // instanceof  вернет true  если обьект принадлежит этому типу данных (с которым он сравнивает)
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Point point = (Point) o;
//
//            if (x != point.x) return false;
//            return y == point.y;
//        }

        // hashCode возвращает число которое генерируется по алгоритму случайных чисел

//        @Override
//        public int hashCode() {
//            int result = x;
//            result = 31 * result + y;
//            return result;
//        }

        // клонирование обьектов (метод  clone())
//  метод  clone() по умолчанию имеет модификатор protected, а это значит, что метод надо переопределить

        Point aClone = a.clone();
        System.out.println(a == aClone); // false
        System.out.println(a.equals(aClone)); // true  так как в классе Point мы переопределили метод equals.
        // По умолчанию в методе equals реализация такая a== aClone и будет возвращен false как в строке 43

        Figure figure = new Figure(3);
        figure.addPoint(a);
        figure.addPoint(b);
        figure.addPoint(c);
        figure.addPoint(d);
        figure.addPoint(f);
        Figure figureClone = figure.clone();
        System.out.println(figure.equals(figureClone)); // true
        System.out.println(figure.getPoints() == figureClone.getPoints()); // false
        System.out.println(Arrays.equals(figure.getPoints(), figureClone.getPoints())); // true
        System.out.println(figure.getPoints()[0] == figureClone.getPoints()[0]); // false
        System.out.println(figure.getPoints()[0].equals(figureClone.getPoints()[0])); // true
    }
}
