package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 0);
        Book book2 = new Book("1984", 318);
        Book book3 = new Book("Anna Karenina", 850);
        Book book4 = new Book("Voina i mir", 1300);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " " +  book.getPages());
        }
        Book book5 = books[0];
        books[0] = books[3];
        books[3] = book5;
        System.out.println("После замены книги с индексом 0 и 3");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " " +  book.getPages());
        }
        System.out.println("Вывод книг с именем \"Clean Code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            int count = 0;
            if ("Clean Code".equals(book.getName())) {
                count++;
                System.out.println(book.getName() + " " + count);
            }
        }
    }
}