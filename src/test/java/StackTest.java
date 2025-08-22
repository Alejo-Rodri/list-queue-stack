import com.training.data.structures.StackImpl;
import org.junit.Test;


import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testNewStackIsEmpty() {
        StackImpl<Integer> stack = new StackImpl<>();

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushIncreasesSize() {
        StackImpl<Integer> stack = new StackImpl<>();

        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopReturnsLastPushedElement() {
        StackImpl<Integer> stack = new StackImpl<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, (int) stack.pop());
        assertEquals(2, stack.size());

        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopOnEmptyStackThrowsException() {
        StackImpl<Integer> stack = new StackImpl<>();
        assertNull(stack.pop());
    }

    @Test
    public void testPeekReturnsTopWithoutRemoving() {
        StackImpl<Integer> stack = new StackImpl<>();
        stack.push(42);
        stack.push(99);

        assertEquals(99, (int) stack.top());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPeekOnEmptyStackThrowsException() {
        StackImpl<Integer> stack = new StackImpl<>();
        assertNull(stack.top());
    }

}
