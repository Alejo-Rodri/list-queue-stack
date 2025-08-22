import com.training.data.structures.QueueImpl;
import org.junit.Test;


import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testNewQueueIsEmpty() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueueIncreasesSize() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        queue.enqueue(10);
        queue.enqueue(20);

        assertEquals(2, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeueReturnsFirstEnqueuedElement() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, (int) queue.dequeue());
        assertEquals(2, queue.size());

        assertEquals(2, (int) queue.dequeue());
        assertEquals(3, (int) queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueOnEmptyQueueThrowsException() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        assertNull(queue.dequeue());
    }

    @Test
    public void testPeekReturnsFrontWithoutRemoving() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        queue.enqueue(42);
        queue.enqueue(99);

        assertEquals(42, (int) queue.first());
        assertEquals(2, queue.size());
    }

    @Test
    public void testPeekOnEmptyQueueThrowsException() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        assertNull(queue.first());
    }
}
