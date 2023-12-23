import java.lang.*;

public class TestBook {
    public static void main (String[] args){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        book1.setAuthor("F. Scott Fitzgerald (Editor:XYZ)");
        book2.setTitle("To Kill a Mockingbird (Special Edition)");
        book3.setYear(1950);

        System.out.println("Updated book details:");
        System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", Year: " + book1.getYear());
        System.out.println("Title: " + book2.getTitle() + ", Author: " + book2.getAuthor() + ", Year: " + book2.getYear());
        System.out.println("Title: " + book3.getTitle() + ", Author: " + book3.getAuthor() + ", Year: " + book3.getYear());
    }
}
