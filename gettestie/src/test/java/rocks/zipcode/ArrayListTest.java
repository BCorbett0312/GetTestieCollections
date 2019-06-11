package rocks.zipcode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListTest {
    @Test
    public void arrayListTest1(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("There");

        assertTrue(arrayList.add("TestyMcTesterFace"));


    }

    @Test
    public void arrayListTest2() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("There");


        assertEquals(2, arrayList.size());

    }

    @Test
    public void arrayListTest3() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("There");


        assertTrue(arrayList.contains("Hi"));
        assertFalse(arrayList.contains("bye"));
    }


    @Test
    public void arrayListTest4(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertTrue(arrayList.add(55));
    }

    @Test
    public void arrayListTest5(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        assertFalse(arrayList.isEmpty());


        arrayList.clear();

        assertTrue(arrayList.isEmpty());

    }

}
