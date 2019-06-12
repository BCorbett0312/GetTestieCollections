package rocks.zipcode;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void treeSetTest1(){
        TreeSet mytreeset = new TreeSet();

        assertFalse(mytreeset.contains(1));


        mytreeset.add(1);

        assertTrue(mytreeset.contains(1));

    }

    @Test
    public void treeSetTest2(){
        TreeSet mytreeset = new TreeSet();
        mytreeset.add(1);
        mytreeset.add(2);


        Integer expected = 2;

        assertEquals(expected, mytreeset.last());

    }
}
