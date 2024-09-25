package org.example;

import java.io.IOException;
import java.util.List;

public class Library {
    private BookRepository repository;

    public void addBook(Book book) throws IOException {
        repository.addBook(book);
    }
    public void removeBook(String isbn) throws IOException {
        repository.removeBook(isbn);
    }
    public Book findBook(String isbn) {
        return repository.getBook(isbn);
    }
    public List<Book> listAllBooks() {
        return repository.getAllBooks();
    }

}
