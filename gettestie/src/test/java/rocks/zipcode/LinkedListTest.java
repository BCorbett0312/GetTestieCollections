package rocks.zipcode;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void linkedListTest1(){
        LinkedList mylinkList = new LinkedList();

        assertTrue(mylinkList.add("Test"));
    }

    @Test
    public void linkedListTest2(){
        LinkedList mylinkList = new LinkedList();
        mylinkList.add("Test");

        String expected = "Test";

        assertEquals(expected, mylinkList.getFirst());
    }


}
