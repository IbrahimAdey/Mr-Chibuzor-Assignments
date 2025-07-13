package TestPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testNewStackIsEmpty() {
        Stacks stack = new Stacks();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushAddsItem() {
        Stacks stack = new Stacks();
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    public void testPopRemovesAndReturnsTop() {
        Stacks stack = new Stacks();
        stack.push(1);
        stack.push(2);
        int value = stack.pop();
        assertEquals(2, value);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPeekDoesNotRemoveItem() {
        Stacks stack = new Stacks();
        stack.push(99);
        assertEquals(99, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmptyStackThrowsError() {
        Stacks stack = new Stacks();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void testPeekEmptyStackThrowsError() {
        Stacks stack = new Stacks();
        assertThrows(IllegalStateException.class, stack::peek);
    }
}
