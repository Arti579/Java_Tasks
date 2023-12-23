import java.util.ArrayList;

public class Main {
    static public void main(String[] args){
        WaitList <String> wait = new WaitList<>();
        ArrayList<String> al = new ArrayList<>();
        al.add("O");
        wait.add("F");
        wait.add("R");
        wait.add("A");
        System.out.println(wait);
        wait.remove();
        System.out.println(wait);
        System.out.println("Есть ли 'F' ? - " + wait.contains("F"));
        al.add("D");
        System.out.println("Есть ли 'W'? - " + wait.containsAll(al));
        System.out.println("Список пуст ? - " +  wait.isEmpty());
        System.out.println("------------------------------");
        BoundedWaitList<String> bout = new BoundedWaitList<>(4);
        bout.add("G");
        bout.add("w");
        bout.add("d");
        bout.add("i");
        bout.add("&");
        System.out.println(bout);
        bout.remove();
        System.out.println(bout);
        bout.add("!");
        System.out.println(bout);
        System.out.println("Объем списка: "+bout.getCapacity());
        System.out.println("----------------------------");
        UnfairWaitList<String> unf = new UnfairWaitList<>();
        unf.add("F");
        unf.add("l");
        unf.add("a");
        unf.add("G");
        System.out.println(unf);
        unf.remove("a");
        System.out.println("Попытка удаления первого элемента: "+unf);
        unf.remove("F");
        System.out.println("Удаление элемента: "+unf);
        unf.moveToBack("G");
        System.out.println("Перенос элемента в конец: "+unf);

    }
}