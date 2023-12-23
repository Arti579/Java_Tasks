import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String em, char g){
        name = n;
        email = em;
        gender = g;
    }
    public Author(String n, char g){
        name = n;
        email = "";
        gender = g;
    }
    public String getName(String name){
        return name;
    }
    public String getEmail(String email){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(char gender){
        return gender;
    }
    public String toString(){
        return this.name+"'s email addres is "+this.email+". Gender: "+this.gender;
    }
}
