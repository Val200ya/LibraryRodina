package org.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    @Override
    public Book getBook(String isbn) {
        if (books.contains(isbn)) {
            for (int i = 0; i < books.size(); i++) {
                return books.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}

