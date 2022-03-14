package lesson5;

import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {
        // char примитивный тип данных  занимает 16 бит.Представляет собой один символ юникода
        // если число тогда от 0 до 65536. Символы '\u0000' до  '\uffff' .
        // Только одинарные кавычки и только один символ
        // Если двойные кавычки или несколько символов, тогда тип данных СТРОКА

        char char1 = 'J'; //  сам  символ
        char char2 = 74; //  его номер из таблицы юникода
        char char3 = '\u0044'; //16-ти ричное представление символа в escape последовательности из таблицы Юникода

        System.out.print(char1); // J  System.out.print без переноса на новую строку
        System.out.print(char2); // J
        System.out.println(char3); // D

        // Строка упорядоченная последовательность символов. Строки задаются в двойных кавычках.
        // Строка это ссылочный тип данных.
        // Строка экземпляр класса String.
        // Строки задаются:
        // 1. в двойных кавычках.
        // 2. new String(),--- используем если способ создания строки через двойные кавычки невозможен.
        // Строки неизменны, можно лишь создать новую строку на основе существующей
        //Пример работы с new String()

        char[] chars = {'\u004A', '\u004A', '\u0044'};

        String jjdString = new String(chars);
        System.out.println(jjdString);
        System.out.println(jjdString.length());

        char[] chars1 = {'\uD83D', '\uDC38'}; // суррогатная пара чаров  char
        String frogString = new String(chars1);
        System.out.println(frogString); // 🐸
        System.out.println(frogString.length()); // количество char 2,а не количество символов в консоле
        System.out.println(frogString.codePoints().count()); // 1 действительное количество символов


        // Хранение строк до Java 9 : массив char [] в кодировке UTF-16
        //  каждый char был представлен двумя байтами

        // Начиная с 9 версии строки(компактные строки) хранятся как массив byte[] + кодировка
        // кодировка LATIN1 (занимает 1 байт.Используют для латиницы (английский язык))
        // или UTF-16(занимает 2 байта. Используют например для Кирилицы(русский язык))


        // ПУЛ СТРОК
        // ПУЛ СТРОК это набор уникальных строк.
        // В пуле строк всегда хранится только одна копия каждого строкового литерала
        // ПУЛ СТРОК сейчас хранит "Строка". string1 и string2 ссылаются на уникальную
        // строку "Строка" которая уже хранится в пуле. Второй раз обьект не создаётся.
        String string1 = "Строка";
        String string2 = "Строка";

        // При создании строки через new String строка хранится вне пула строк.
        // при созданнии строки через new String создаётся какждый раз новый обьект и хранится в heap памяти(в кучи)

        String string3 = new String("Строка");

        // ссылочные типы данных нельзя сравнивать через ==  так как сравниваются ссылки, а не содержимое обьектов
        // через == можно сравнивать только примитивы

        String internString = string3.intern(); // Мы интернировали строку.
        // Метод intern смотрит в пул строк и если такая строка
        // есть в пуле строк, тогда он возвращает ссылку на аналогичную строку в пуле строк.
        // Если такой строки нет, тогда метод создаёт в пуле строк такую строку и возвращает на неё ссылку.


        // Сравнение строк с помощью метода equals
        // строки нельзя сравнивать через ==  так как сравниваются ссылки
        string2 = "Строка";
        System.out.println(string1.equals(string2)); // true
        System.out.println("строка".equals(string2)); // false так как метод регистрозависимый.
        System.out.println("строка".equalsIgnoreCase(string2)); // true так как метод нерегистрозависимый.


        string2 = null;
        System.out.println("строка".equals(string2)); // так делать лучше, чем наоборот (на строку ниже).
        // У строки есть метод equals, а у null его нет. В этом варианте прорамма будет работать
//        System.out.println(string2.equals("строка"));//у null нет метода equals и прорамма упадёт с NullPointerException


//        Сравнение на null
        System.out.println(string2 == null); // true
        System.out.println(string2 != null); // false


        string1 = "Java";
        string2 = "Python";

        // конкатинация строк

        String concatString = string1 + " ::: " +string2;

        System.out.println(concatString);

        concatString = string1.concat(" --- " + string2).concat("___" + string3);
        System.out.println(concatString);

        concatString = string1.join(" --- ", string2, string2,string3,frogString).concat(":::" + string3);
        System.out.println(concatString);
        concatString= "";
        for (int i = 0; i < 10; i ++){
            concatString += i + "-"; //  так делать не стоит так как на каждой итерации создаётся отдельный обьект
            // и отдельная ссылка и память может переполнится.В нашем случае 10 новых обьектов в памяти.
        }
        System.out.println(concatString);

        // При конкатинации строк в цикле лучше использовать.
        // StringBuilder --- он работает быстрее, чем StringBuffer. Опасный для работы в потоке данных.
        // StringBuffer --- он потокобезопасный.

        // При использовании StringBuilder не создается большое количество новых обьектов.
        // Он запоминает все строки  в память и потом в конце создаёт один обьект.

        concatString = "Начало строки ";
        StringBuilder sb = new StringBuilder(concatString); // можно ничего не передавать и тогда склейка начнется с пустоты
sb.append(string1).append(string2);
        System.out.println(sb);

StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < 10; i ++){
            sb2.append(i).append(" "); // лучше делать так. В этом случае на каждой итерации не создаётся
            // отдельный обьект, а происходит накопление в память.В конце создан 1 новый
            // обьект в памяти, вместо 10 обьектов.
        }
        System.out.println(sb2);
        // чтобы достать String из StringBuilder надо применить метод toString()
        String sbString = sb2.toString();
        System.out.println(sbString);

        // В println внутри уже реализован метод toString() и поэтому он спокойно выводит в консоль StringBuilder

        // Метод split()
        String langs = "Java, Python, JavaScript";
        String [] langArr = langs.split(", ");
        System.out.println(Arrays.toString(langArr));


//методы замены
        String newString = langs.replaceAll(", "," - "); //заменяет во всех элементах массива и
        // поддерживает регулярные выражения
        System.out.println(newString);

        String newString1 = langs.replaceFirst(", "," - "); //заменяет только в первом элементе массива
        System.out.println(newString1);

        String newString2 = langs.replace(", "," -replace "); //заменяет во всех элементах массива
        // не поддерживает регулярные выражения
        System.out.println(newString2);


//        Метод contains проверяет строка содержит или  нет заданную последовательность символов. Содержит --- true .
//        Не содержит --- false
        System.out.println(langs.contains("th")); //true

        // Метод startsWith проверяет начинается ли строка с указанной последовательности символов.
        // Заканчивается --- true . Не заканчивается  --- false .


        System.out.println(langs.startsWith("j")); //false



        // Метод endsWith проверяет заканчивается ли строка с указанной последовательности символов.
        // Заканчивается --- true . Не заканчивается  --- false
        System.out.println(langs.endsWith("Script")); //true

        // Метод startsWith в этом случае проверяет начинается ли строка с индекса 1  с указанной последовательности символов().
        langs = "Java, Python, JavaScript";

        System.out.println(langs.startsWith("a",1)); // true





    }
}

