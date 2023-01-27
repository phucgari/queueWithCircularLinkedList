import javax.xml.soap.Node;
import java.util.LinkedList;

public class Queue<E> {
    public LinkedList<E> list =new LinkedList<>();
    public E display(){
        return list.getLast();
    }

    public void enqueue(E e) {
        list.addFirst(e);
    }
    public E dequeue(){
        E item=display();
        list.removeLast();
        return item;
    }
    public E getRear(){
        return list.getFirst();
    }
    public E getFront(){
        return list.getLast();
    }
}