import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue<String> queue=new Queue<>();
    @Test
    void testDisplayQueue(){
        queue.list.add("abc");
        assertEquals("abc",queue.display());
    }
    @Test
    void testEnqueue(){
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        assertEquals("a",queue.display());
    }
    @Test
    void testDequeue(){
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        assertEquals("a",queue.dequeue());
        assertEquals("b",queue.dequeue());
        assertEquals("c",queue.dequeue());
    }
    @Test
    void getFrontAndRear(){
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        assertEquals("a",queue.getFront());
        assertEquals("c",queue.getRear());
    }
}