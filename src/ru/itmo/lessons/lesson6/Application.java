package ru.itmo.lessons.lesson6;

import ru.itmo.lessons.lesson6.books.Author;
import ru.itmo.lessons.lesson6.books.Book;
import ru.itmo.lessons.lesson6.books.Shelf;


// полное имя класса: имя пакета + имя класса, например ru.itmo.lessons.lesson6.Application
public class Application {
    public static void main(String[] args) {
        // класс это шаблон с перечислением будущих характеристик и методов
        // класс это способ описания сущности, определяющей состояние и поведение обьекта
        // класс - это набор свойств и методов для будущих обьектов
        // на основе класса создаются обьекты (экземпляры данного класса) - представители данного класса,
        // имеющие конкретное состояние и поведение, определенное в классе

        // books ---> Author
        // обьект, экземпляр класса Author.

        // если МОДИФИКАТОР ДОСТУПА  public, тогда мы можем обратится к свойству из любого класса, любой точки программы.
//         если модификатор доступа private, тогда мы можем обратится к свойствам только внутри класса, внутри фигурных скобок


        Author author1 = new Author();
        // Обращение к свойствам обьекта осуществляется через точку
        author1.name = "Tom";
        author1.surname = "Smith";
        System.out.println(author1.name + " " + author1.surname + "");
        Author author2 = new Author();
        author2.name = "Bob";
        author2.surname = "Smith Junior";

        // ОБЬЯВЛЕНИЕ МЕТОДОВ
        // у Методов две категории :
        // 1) VOID  --- Не возвращает результат работы, а просто выполняет инструкции внутри
        // 2)  --- Выполняет инструкции и  возвращает результат работы,

//     public void printFullName() {  методы обьявляем в классе. В нашем случае в классе Application
//            System.out.println(author1.name + "" + author1.surname);
//        }

        // ВЫЗОВ МЕТОДА
        author1.printFullName();
        author2.printFullName();

        String fullName = author1.getFullName();
        System.out.println(fullName);

        // СЕТТЕРЫ и ГЕТТЕРЫ
        Book book1 = new Book(); // вызов конструктора
        book1.setTitle("Книга"); // название от 3 символов
        System.out.println(book1.getTitle());
        book1.setPageCount(22);

        Book book2 = new Book(author2);
        book2.setTitle("Java 17");
        book2.setPageCount(3700);

        Book book3 = new Book(author1);
        book3.setTitle("Строки в Java");
        book3.setPageCount(1200);

        Book book4 = new Book(author1);
        book4.setTitle("Коллекции в Java");
        book4.setPageCount(300);

        Book book5 = new Book(author2);
        book5.setTitle("Многопоточность в Java");
        book5.setPageCount(2600);


        // Создаём полку для книг
        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book1,book1,book1); // при вызове метода аргументы собираются в массив и ссылка на массив
        // присваивается локальной переменной books


        //вывод имени автора первой книги на полке
        System.out.println(shelf.books[0].getAuthor().name);
        // вывод имени автора первой книги на полке
        System.out.println(shelf.getBooks()[0].getAuthor().name);
        // 1. shelf - экземпляр класса Shelf
        // 2. shelf.getBooks() метод вернет ссылку на значение свойства books объекта shelf - массив книг
        // 3. shelf.getBooks()[0] обратились к элементу массива с индексом 0 - экземпляр класса Book
        // 4. shelf.getBooks()[0].getAuthor() метод вернет ссылку на значение свойства author книги
        // 5. shelf.getBooks()[0].getAuthor().name получили значение свойства name автора

    }
}
