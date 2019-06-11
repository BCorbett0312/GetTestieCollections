package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2(){
        Stack<Integer> stack = new Stack<>();
        stack.push( 1);
        assertEquals(false, stack.isEmpty());

        stack.pop();
        assertEquals(true, stack.isEmpty());
    }


    @Test
    public void TestStack3(){
        Stack<Integer> stack = new Stack<>();
        stack.push( 1);
        stack.push(2);
        Integer expected =2;

        Assert.assertEquals(expected, stack.peek());

    }

    @Test
    public void TestStack4(){
        Stack<Integer> stack = new Stack<>();
        assertEquals(true, stack.isEmpty());

        stack.push(55);
        assertEquals(false, stack.isEmpty());
    }

    // Make a bigger test exercising more Stack methods.....
}
