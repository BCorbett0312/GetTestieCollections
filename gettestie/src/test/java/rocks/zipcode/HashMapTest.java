package rocks.zipcode;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapTest {
    @Test
    public void HashMapTest1(){
        HashMap myHash = new HashMap<String, Integer>();
        myHash.put("big", 1);
        int expected = 1;


        assertEquals(expected, myHash.size());


    }

    @Test
    public void HashMapTest2(){
        HashMap myHash = new HashMap<String, Integer>();
        assertTrue(myHash.isEmpty());
        myHash.put("big", 1);

        assertFalse(myHash.isEmpty());

        myHash.clear();

        assertTrue(myHash.isEmpty());

    }
}
