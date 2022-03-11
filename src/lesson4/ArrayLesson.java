package lesson4;

import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        // Области видимости. Переменные видны только внутри фигурных скобок.age -видна глобально,а code видна только внутри if
        int age = 22;

        if (age > 18) {
            int code = 123;
            System.out.println("Вам" + age);
            System.out.println("Доступ разрешен. Ваш код " + code);
        }

        // примитивные типы данных
        // ссылочные типы данных

//  создание массива (оба варианта правильные. Лучше использовать вариант на 18 строке/ этот int [] ints1 =)
//        int [] ints1 = new int[7]/ массив на 7 элементов.По умолчанию для инта массив заполнен нулями
//        int ints2 [] =

        int[] ints1 = new int[7];
        System.out.println(ints1); // так массив в консоль не выведешь.Там ерунда будет такая [I@448139f0

        Arrays.toString(ints1);
        System.out.println(Arrays.toString(ints1));


        int[] ints2 = {6, 7, 8, 9, 11, 12};
        System.out.println(Arrays.toString(ints2));

        ints2 = new int[3]; //Так можно делать. Теперь ссылка ints2 ссылается на новую область памяти. Доступ к старой области утерян и его удалит сборщик мусора.
        System.out.println(ints2);

//        ints2 = {34,35,36,37};  Так нельзя.

        ints2 = new int[]{34, 35, 36, 37}; // Так можно. Теперь ссылка ints2 ссылается на новую область памяти


        // длина массива это положительное значение типа int
        int len = 10;
        int[] ints3 = new int[len];
        int[] ints4 = new int[len + 5]; // length = 15

        System.out.println(ints4.length); // узнаем длину массива

        // доступ к элементам массива

        System.out.println(ints4[5]);
        ints4[5] = 78;
        System.out.println("новое значение элемента массива --->" + ints4[5]);
        System.out.println(Arrays.toString(ints4));

        // далее ошибка времени выполнения. Массив вышел за свои границы ArrayIndexOutOfBoundsException.Размер ints4 равен 12
        // System.out.println(ints4[100]);

// Многомерные массивы
        // [ [1,2,3], [4,5,6,],[7,8,9] ]

        int[][] ints5 = new int[3][4]; // в первых скобах[3] это длина внешнего массива. Вторые скобки [4] это размер внутренних массивов, все по 4

        System.out.println("Arrays.deepToString(ints5) --->" + Arrays.deepToString(ints5));


        int[][] ints6 = new int[3][]; //[null, null, null]; // в первых скобах[3] это длина внешнего массива. Вторые скобки пустые[] это когда размеры внутренних массивов, все разные

        System.out.println("Arrays.deepToString(ints6) --->" + Arrays.deepToString(ints6));

        //Наполняем массив с неопределенной длиной внутренних массивов
        ints6[0] = new int[2]; //[[0,0], null, null]
        ints6[1] = new int[3]; //[[0,0], [0,0,0], null]
        ints6[2] = new int[4]; //[[0,0], [0,0,0], [0,0,0,0]]

        System.out.println("Arrays.deepToString(ints6) --->" + Arrays.deepToString(ints6));

        ints6[2][1] = 90;

        ints6[1][2] = 39;
        System.out.println("Arrays.deepToString(ints6) --->" + Arrays.deepToString(ints6));
//      Arrays.deepToString(ints6) --->[[0, 0], [0, 0, 39], [0, 90, 0, 0]]


        // меняем значение элемента массива с помощью for

        int[] ints7 = {0, 2, 3, 5, 6, 7, 9};
        for (int i = 0; i < ints7.length; i++) {
            ints7[i] = ints7[i] * ints7[i];
            System.out.println(ints7[i]);
        }

        int[] ints8 = {0, 2, 3, 5, 6, 7, 9};
        int summ = 0;
        // найти сумму значений элементов массива ints7
        for (int i = 0; i < ints8.length; i++) {
            summ = summ + ints8[i];

        }
        System.out.println(summ);


// для перебора коллекций, где нет индексов. Не предоставляет доступа к индексам
// не даёт возможность изменить значение элементов массива.Похож на  forEach
        summ = 0;
        for (int element : ints7) {
            System.out.println(element);
            summ = summ + element;
        }
        System.out.println(summ);


        // найти минимальное значение элементов массива ints8 и вывести в консоль
        double[] ints9 = {10, 1, 0.2, 3, 5, 6, 7, 9};
        double minValue = 100.0;
        for (double element : ints9) {
            if (minValue > element) {
                minValue = element;

            }
        }
        System.out.println(minValue);


        // вывести в консоль случайный элемент массива ints9. Использовать Math.random()

        int randomNum = (int) (Math.random() * ints9.length);
        double res = ints9[randomNum];
        System.out.println(res);


        //  сортировка массива методом sort

        Arrays.sort(ints9);
        System.out.println(Arrays.toString(ints9));


        // отсортированный массив ints9 выглядит так --->> [0.2, 1.0, 3.0, 5.0, 6.0, 7.0, 9.0, 10.0]
        //  сортировка массива методом binarySearch  ищет в массиве ints9 число 3.0 и
        //  возвращает индекс числа 3.0 в массиве ints9
        //  если числа в массиве нет, тогда вернёт отрицательное значение(число меньше ноля)
        // число после минуса расчитывается так. Система предпологает, где в отсртированном массиве могло бы
        // находится число (2 между число 1 и числом 3) и прибавляет единицу и ставит перед числом минус

        int element = Arrays.binarySearch(ints9, 3.0); // индекс 2
        int element1 = Arrays.binarySearch(ints9, 3.9);// индекс 3 +1 и равно -4
        int element2 = Arrays.binarySearch(ints9, 23.9);// индекс 8 +1 и равно -9

        System.out.println(element);
        System.out.println(element1);
        System.out.println(element2);


        // Копирование массива

        double [] ints10 = {3.7, 4.8, 5.9, 0.8, 4.7};
//        double ints11 = ints10; так нельзя. Просто добавили к существующему массиву ещё одну ссылку

//        Надо так:
        double [] cloneInts10 = ints10.clone(); // клонировали ints10 в новый созданный массив
        double [] copyInts10 = Arrays.copyOf(ints10, 4); // копировали ints10 в новый созданный
        // массив и указали сколько элеиентов копировать. Мы скопировали только 4 первых элемента
        System.out.println(Arrays.toString(copyInts10));
        System.out.println(Arrays.toString(cloneInts10));


        double [] newDoubles  = new double[10];

        System.arraycopy(ints10, 1,newDoubles,3,2);
        System.out.println(Arrays.toString(newDoubles));
//        ints10 откуда копируем , srcPos 1 -->c какого индекса берём в ints10 ,newDoubles ---> массив в
//        который копируем , destPos 3 <--- c какого индекса записываем значения в новый массив,
//        length 2 <-- сколько элементов берём в ints10 и кладём в новый массив

//        ints10 = {3.7, 4.8, 5.9, 0.8, 4.7} откуда копируем
        //newDoubles [0.0, 0.0, 0.0, 4.8, 5.9, 0.0, 0.0, 0.0, 0.0, 0.0] куда копируем
    }
}
