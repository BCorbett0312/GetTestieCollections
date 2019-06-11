package rocks.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class HashSetTest {
    @Test
    public void hastSetTest1(){
        HashSet<Integer> hashSet = new HashSet<>();

        assertEquals(true, hashSet.add(1));
    }

    @Test
    public void hashSetTest2(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        Integer expected = 3;

        assertFalse(expected == hashSet.size());

    }

    @Test
    public void hashSetTest3() {
        HashSet<Integer> hashSet = new HashSet<>();
        assertTrue(hashSet.isEmpty());

    }

    @Test
    public void hashSetTest4() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);


        assertTrue(hashSet.contains(1));
        assertTrue(hashSet.contains(2));
        assertFalse(hashSet.contains(3));

    }

    @Test
    public void hashSetTest5() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);

        assertEquals(2, hashSet.size());



        assertTrue(hashSet.remove(2));


        assertEquals(1, hashSet.size());
    }

    @Test
    public void hashSetTest6() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(null);
        assertEquals(3, hashSet.size());

        hashSet.clear();

        assertEquals(0, hashSet.size());


    }




}
