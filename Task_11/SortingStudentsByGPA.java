import java.util.Comparator;
import java.util.Arrays;
import java.util.*;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    public String name;
    public int bal;

    public SortingStudentsByGPA(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    @Override
    public int compareTo(SortingStudentsByGPA o) {
        return o.bal - this.bal;
    }
    public static void main(String[] args){
        List<SortingStudentsByGPA> r = new ArrayList<>();
        r.add(new SortingStudentsByGPA("Thomas", 5));
        r.add(new SortingStudentsByGPA("John", 3));
        r.add(new SortingStudentsByGPA("Paul", 4));
        r.add(new SortingStudentsByGPA("Margaret", 4));
        r.add(new SortingStudentsByGPA("Anna", 5));
        r.add(new SortingStudentsByGPA("Elizabeth", 5));
        Collections.sort(r);
        for (SortingStudentsByGPA s : r){
            System.out.println(s.name+ " grades: "+s.bal);
        }
    }
}

