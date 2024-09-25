package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Library library = new Library();
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", "ISBN 978-5-535-00243-9",
                1940);
        library.addBook(book1);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", "ISBN 978-5-535-53880-8",
                1866);
        library.addBook(book2);
        Book book3 = new Book("Евгений Онегин", "Александр Пушкин", "ISBN 978-5-535-00058-9",
                1833);
        library.addBook(book3);
        library.removeBook("ISBN 978-5-535-53880-8");
        library.findBook("ISBN 978-5-535-00058-9");
        library.listAllBooks();
    }
}