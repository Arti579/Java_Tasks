import java.lang.*;

public class Book {
    private String title; // Название книги
    private String author; // Автор книги
    private int year; // Год издания книги

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}
