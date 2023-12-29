import java.util.ArrayList;

public class Main {
    static public void main(String[] args){
        WaitList <String> wait = new WaitList<>();
        ArrayList<String> al = new ArrayList<>();
        al.add("O");
        wait.add("P");
        wait.add("R");
        wait.add("A");
        System.out.println(wait);
        wait.remove();
        System.out.println(wait);
        System.out.println("Is there an 'A' ? - " + wait.contains("A"));
        al.add("T");
        System.out.println("Is there a 'T'? - " + wait.containsAll(al));
        System.out.println("The list is empty? - " +  wait.isEmpty());
        System.out.println(" ");
        BoundedWaitList<String> bout = new BoundedWaitList<>(4);
        bout.add("t");
        bout.add("o");
        bout.add("F");
        bout.add("h");
        bout.add("&");
        System.out.println(bout);
        bout.remove();
        System.out.println(bout);
        bout.add("!");
        System.out.println(bout);
        System.out.println("List size: "+bout.getCapacity());
        System.out.println(" ");
        UnfairWaitList<String> unf = new UnfairWaitList<>();
        unf.add("P");
        unf.add("R");
        unf.add("W");
        unf.add("q");
        System.out.println(unf);
        unf.remove("P");
        System.out.println("Trying to remove the first element: "+unf);
        unf.remove("P");
        System.out.println("Removing an element: "+unf);
        unf.moveToBack("W");
        System.out.println("Move element to end: "+unf);

    }
}
