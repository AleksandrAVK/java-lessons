package ru.itmo.lessons.lesson6.books;

import java.util.Objects;

public class Book {
    // свойства
    private String title = "";                // название
    private Author author = new Author();     // автор
    private int pageCount = 0;                // количество страниц

    public Book(){} //  создаём три  конструктора для трёх  типов поведения.
    // Один конструтор с передачей аргументов при вызове и
    // второй конструтор без аргументов при вызове
    // третий конструктор принимает title  и author

    public Book (Author author){ // тут передаём ссылку на экземпляр класса
        // инструкции которые должны быть выполнены при вызове конструктора
        this.author = Objects.requireNonNull(author, "author  не может быть равен null");  // в Objects собраны методы для работы с обьектами
        // Objects.requireNonNull проверить author на неравенство null, если author не равен null
    }

    public Book(String title, Author author){
        this(author); // вызываем другой конструктор для проверки author или можем вызвать сеттер
        setTitle(title);
    }




    // если модификатор доступа private но значения установить надо, тогда создаём методы внутри класса
    // которые позволяют установить значения в свойства String, Author и т.д.
    // методы позволяющие установить значения свойств со всеми необходимыми проверками --- называют сеттеры

    public void setTitle(String titleValue){

        if (titleValue == null || titleValue.length() < 3) {
            throw new IllegalArgumentException("Значение title должно быть от 3 символов и выше");
        }
        title = titleValue;
    }

    // методы, которые возвращают значение свойств --- геттеры

    public String getTitle(){
        return title;
    }

    public void setPageCount(int pageCount){
        if(pageCount < 1){
            throw new IllegalArgumentException("В книге должно быть больше ноля страниц");
        }
        // this  --- это ссылка на текущий обьект.
        this.pageCount = pageCount;
    }



    public int getPageCount() {
        return pageCount;
    }

    public Author getAuthor() {
        return author;
    }
}
