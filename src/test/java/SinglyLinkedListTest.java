import com.training.data.structures.SinglyLinkedListImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void testIsEmptyOnNewList() {
        var list = new SinglyLinkedListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testAddFirst() {
        var list = new SinglyLinkedListImpl<>();
        list.addFirst(10);
        list.addFirst(20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    public void testAddLast() {
        var list = new SinglyLinkedListImpl<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        assertEquals(3, list.size());
        assertTrue(list.contains(1));
        assertTrue(list.contains(3));
    }

    @Test
    public void testRemoveFirst() {
        var list = new SinglyLinkedListImpl<>();
        list.addLast(100);
        list.addLast(200);

        int removed = (int) list.removeFirst();
        assertEquals(100, removed);
        assertEquals(1, list.size());
        assertFalse(list.contains(100));
    }

    @Test
    public void testRemoveFirstFromEmptyThrowsException() {
        var list = new SinglyLinkedListImpl<>();
        assertNull(list.removeFirst());
    }

    @Test
    public void testContains() {
        var list = new SinglyLinkedListImpl<>();
        list.addLast(42);
        list.addLast(99);

        assertTrue(list.contains(42));
        assertFalse(list.contains(123));
    }
}
