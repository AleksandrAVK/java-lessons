package ru.itmo.lessons.lesson6.books;

public class Author {

        // перечисляем свойства(поля или аттрибуты их ещё называют), характеристики
        public String name;
        public String surname;

// обьявление методов
     public void printFullName() {
             // в void мы используем return только для того, чтобы прервать работу метода и завершить выполнение инструкций
            System.out.println(name + "" + surname);
        }

        public String getFullName() {
                //  возвращает результат работы метода
                //  прерывает работу инструкций в методе после return
                return name + "" + surname;
        }
}
