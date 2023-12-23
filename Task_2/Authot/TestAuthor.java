import java.lang.*;
public class TestAuthor {
    public static void main (String[] args) {
        Author a1 = new Author("Lee Everet", "le6874@gmail.com", 'm');
        Author a2 = new Author("Emma Stone", "emma.s13@gmail.com", 'w');
        Author a3 = new Author("Jack Black", 'm');
        a3.setEmail("jb_s78@gmail.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
