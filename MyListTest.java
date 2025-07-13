package TestPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {

    @Test
    public void testNewListIsEmpty() {
        MyList list = new MyList();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testAddIncreasesSize() {
        MyList list = new MyList();
        list.add(10);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }

    @Test
    public void testGetReturnsCorrectElement() {
        MyList list = new MyList();
        list.add(5);
        list.add(7);
        assertEquals(7, list.get(1));
    }

    @Test
    public void testRemoveReturnsAndDeletesElement() {
        MyList list = new MyList();
        list.add(1);
        list.add(2);
        int removed = list.remove(0);
        assertEquals(1, removed);
        assertEquals(1, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    public void testGetOutOfBoundsThrowsException() {
        MyList list = new MyList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    public void testRemoveOutOfBoundsThrowsException() {
        MyList list = new MyList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }
}

