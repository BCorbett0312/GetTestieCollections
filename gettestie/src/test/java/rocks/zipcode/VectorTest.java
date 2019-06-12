package rocks.zipcode;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;



public class VectorTest {

    @Test
        public void vectorTest1() {
        Vector myVector = new Vector();

        assertTrue(myVector.add(6));
    }

    @Test
        public void vectorTest2(){
        Vector myVector = new Vector();

        assertTrue(myVector.add(6));


        myVector.clear();

        assertTrue(myVector.isEmpty());
    }
}
