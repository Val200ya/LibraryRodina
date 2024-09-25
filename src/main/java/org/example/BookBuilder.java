package org.example;

public class BookBuilder {
    private String title = null;
    private String author = null;
    private String isbn = null;
    private int publicationYear = 0;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book build() {
        Book book = new Book(title, author, isbn, publicationYear);
        return book;
    }
}
