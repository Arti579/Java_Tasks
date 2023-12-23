class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Автор книги", "Название книги", 2023);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());
        book.setAuthor("Какой-то автор");
        book.setTitle("Какое-то название книги");
        book.setYear(2025);
        System.out.println("Обновленный автор: " + book.getAuthor());
        System.out.println("Обновленное название: " + book.getTitle());
        System.out.println("Обновленный год написания: " + book.getYear());
    }
}
