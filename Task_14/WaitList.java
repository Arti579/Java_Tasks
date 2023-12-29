import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;
    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<>(c);
    }

    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    public void add(E element) {
        content.add(element);
    }

    public E remove() {
        if(isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }
        return content.remove();
    }

    public boolean contains(E element) {
        boolean res = false;
        for (int i = 0; i < content.size(); i++) {
            E cur = content.remove();
            if (cur.equals(element))
                res = true;
            content.add(cur);
        }
        return res;
    }

    public boolean containsAll(Collection<E> c) {
        ArrayList<E> al = new ArrayList<>(c);
        boolean res = false;
        for(int i = 0; i < c.size(); i++){
            res = false;
            for(int j = 0; j < content.size(); j++){
                E el = content.remove();
                if(el.equals(al.get(i))) res = true;
                content.add(el);
            }
            if(!res) return res;
        }
        return res;
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }
}
