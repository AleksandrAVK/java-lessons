package ru.itmo.lessons.lesson6.books;

import java.util.Arrays;

public class Shelf {
   private String color = "белый"; // цвет полки
    public Book[] books = new Book[10];// книги

    public Book[] getBooks() {
        return books;
    }

    // ПЕРЕГРУЗКА МЕТОДОВ !!!

    // метод для добавления одной книги в массив
    public void addBook(Book book){
        for (int i =0; i< books.length; i +=1){
            if (books[i] == null){
                books[i] = book;
            }
        }
        System.out.println("Закончилось место в массиве");
    }


    // метод для добавления нескольких книг в массив

    // метод добавления нескольких книг на полку
    public void addBook(Book... books){ //  books - массив, состоящий из элементов, переданных в метод через запятую
        System.out.println(Arrays.toString(books));
        for (Book book : books) {
            addBook(book); // вызов метода addBook(Book book)
        }
    }



}
