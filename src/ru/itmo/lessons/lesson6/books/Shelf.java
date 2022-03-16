package ru.itmo.lessons.lesson6.books;

public class Shelf {
   private String color = "белый"; // цвет полки
    public Book[] books = new Book[10];// книги


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

    public void addBook(Book... books){

    }


}
