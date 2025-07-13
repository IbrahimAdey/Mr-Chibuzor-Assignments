package TestPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testNewQueueIsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueAddsItem() {
        Queue queue = new Queue();
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
        assertEquals(10, queue.peek());
    }

    @Test
    public void testDequeueRemovesAndReturnsFront() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        int removed = queue.dequeue();
        assertEquals(1, removed);
        assertEquals(1, queue.size());
        assertEquals(2, queue.peek());
    }

    @Test
    public void testPeekDoesNotRemoveItem() {
        Queue queue = new Queue();
        queue.enqueue(42);
        assertEquals(42, queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    public void testDequeueOnEmptyThrowsError() {
        Queue queue = new Queue();
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    public void testPeekOnEmptyThrowsError() {
        Queue queue = new Queue();
        assertThrows(IllegalStateException.class, queue::peek);
    }
}

