package org.example;

import java.io.IOException;
import java.util.List;

public interface BookRepository {
    void addBook(Book book) throws IOException;
    void removeBook(String isbn) throws IOException;
    Book getBook(String isbn);
    List<Book> getAllBooks();
}
