import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest1 {

    @Test
    public void testSameDay() throws Exception {
        App app1=new App();
        int val =app1.cal(1,1,1,1,1990);
        assertEquals(0,val);
    }
    @Test
    public void testLeapDays() throws Exception {
        App app1=new App();
        int val =app1.cal(2,1,3,1,2020);
        assertEquals(29,val);
    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void invalidTest() throws Exception {
        App app1=new App();
        int val =app1.cal(20,1,3,1,2020);
    }
}