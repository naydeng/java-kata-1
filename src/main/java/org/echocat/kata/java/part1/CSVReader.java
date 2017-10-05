package org.echocat.kata.java.part1;

public class CSVReader
{
    private String title;
    private String isbn;
    private String authors;
    private String description;

    public CSVReader(String title, String isbn,
                     String authors, String description) {
        super();
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAuthors() {
        return authors;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee [title=" + title + ", isbn=" + isbn
                + ", authors=" + authors + ", description=" + description + "]";
    }

}