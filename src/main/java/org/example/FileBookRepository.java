package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileBookRepository implements BookRepository {
    ArrayList<Book> books = new ArrayList<>();
    String filename = "library.json";
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void addBook(Book book) throws IOException {
        books.add(book);
        mapper.writeValue(new File(filename), books);
    }

    @Override
    public void removeBook(String isbn) throws IOException {
        books.remove(isbn);
        mapper.writeValue(new File(filename), books);
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
