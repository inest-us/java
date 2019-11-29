
package us.inest.app.tdd.sample;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SampleTest {

    @Test
    public void isGreaterTest() throws Exception {
        System.out.println("Test");
        Sample aSample = new Sample();
        assertTrue("Num 1 is greater than Num 2", aSample.isGreater(4, 3));
    }

}
