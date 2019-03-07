package  com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfNumberTest {
     NumberOfNumber obj;
    @Before
    public void setUp() throws Exception {
        obj = new NumberOfNumber();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void numTest() {
        assertEquals(6,obj.num(new int[] {11 ,12,13,14,15},5,1));
    }

}