package rocks.zipcode;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

public class ArrayDequeTest {
    @Test
    public void arrayDequeTest1(){
        ArrayDeque mydeque = new ArrayDeque();
        assertTrue(mydeque.isEmpty());


        mydeque.add(1);
        mydeque.addFirst(5);

        assertFalse(mydeque.isEmpty());


    }


    @Test
    public void arrayDequeTest2(){
        ArrayDeque mydeque = new ArrayDeque();
        assertTrue(mydeque.isEmpty());


        mydeque.add(1);
        mydeque.addFirst(5);


        Integer expected = 5;

        assertEquals(expected, mydeque.getFirst());
    }


}
