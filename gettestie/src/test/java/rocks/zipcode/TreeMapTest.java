package rocks.zipcode;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class TreeMapTest {
    @Test
    public void treeMapTest1(){
        TreeMap mytreemap = new TreeMap();
        mytreemap.put(1, 2);
        mytreemap.put(1, 1);

        assertFalse(mytreemap.isEmpty());

    }

    @Test
    public void treeMapTest2(){
        TreeMap mytreemap = new TreeMap();
        mytreemap.put(1, 2);
        mytreemap.put(1, 1);

        Integer expected = 1;

        assertEquals(expected, mytreemap.get(1));

    }
}
