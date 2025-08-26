import com.training.data.structures.PriorityQueueImpl;
import com.training.interfaces.IPriorityQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPriorityQueueTest {

    private IPriorityQueue<String> queue;

    @BeforeEach
    void setUp() {
        queue = new PriorityQueueImpl<>();
    }

    @Test
    void testIsEmptyOnNewQueue() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    void testOfferSingleElement() {
        queue.offer(1, "A");
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
        assertEquals("A", queue.peek());
    }

    @Test
    void testOfferMultipleElementsKeepsPriorityOrder() {
        queue.offer(5, "C"); // menor prioridad
        queue.offer(1, "A"); // mayor prioridad
        queue.offer(3, "B");

        assertEquals(3, queue.size());
        assertEquals("A", queue.peek(), "El de mayor prioridad (key=1) debe estar al frente");
    }

    @Test
    void testPollRemovesInPriorityOrder() {
        queue.offer(5, "C");
        queue.offer(1, "A");
        queue.offer(3, "B");

        assertEquals("A", queue.poll()); // prioridad 1
        assertEquals("B", queue.poll()); // prioridad 3
        assertEquals("C", queue.poll()); // prioridad 5

        assertTrue(queue.isEmpty());
    }

    @Test
    void testPollOnEmptyQueueReturnsNull() {
        assertNull(queue.poll());
    }

    @Test
    void testPeekDoesNotRemoveElement() {
        queue.offer(2, "X");
        assertEquals("X", queue.peek());
        assertEquals(1, queue.size(), "peek no debe eliminar el elemento");
    }

    @Test
    void testOfferWithSamePriorityKeepsInsertionOrder() {
        queue.offer(1, "A");
        queue.offer(1, "B");

        assertEquals("A", queue.poll()); // llegó primero
        assertEquals("B", queue.poll());
    }
}
