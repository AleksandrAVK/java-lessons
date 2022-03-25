package ru.itmo.lessons.lesson9;

import java.util.Arrays;

//  все классы наследуются от класса object
public final class Figure {
    private final Point[] points; // final означает. что имени points нельзя присвоить другую ссылку.
    // points , всегда будет ссылаться только на вот этот массив указанный при инициализации в строке 4

    public Figure(int pointCount) {
        if (pointCount < 2) {
            throw new IllegalArgumentException("Фигура должна содержать, " + "минимум из двух точек");
        }
        this.points = new Point[pointCount];
    }

    public Point[] getPoints() {
        return points;
    }


    // метод добавления точки в массив. Одинаковые точки нельзя добавлять в массив.В массиве сначала [null,null,null]

    public void addPoint(Point point) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] != null && points[i].equals(point)) {
                System.out.println("Точка " + point + " не была добавлена. Можно добавлять только разные точки ");
                return;
            }
            if (points[i] != null) {
                points[i] = point;
                System.out.println("Точка " + point + " была добавлена.");
                return;
            }
        }

        System.out.println("Точка " + point + " не была добавлена. У фигуры достаточно точек ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        //надо обязательно переопределить метод equals. Мы переопределили его в классе Point
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    // переопределяем метод clone (). Наш метод возвращает Figure,  а не Object и он публичный
    @Override
    public Figure clone(){
        // super.clone нельзя так как это ссылочный тип обьекта и все ссылки будут
        // указывать на один обьект и менять его
        Figure copy = new Figure(points.length);
        for (int i = 0; i < points.length; i++) {
            copy.points[i] = points[i].clone();
        }
        return  copy;
    }



    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
