package us.inest.app.epi.dp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinStepsToOneTest {
    @Test
    public void testGetMinStepsRec() {
        int steps = MinStepsToOne.getMinStepsRec(6);
        assertEquals(2, steps);
    }
    
    @Test
    public void testGetMinStepsDP_n100() {
        int steps = MinStepsToOne.getMinSteps(100);
        assertEquals(7, steps);
    }
    
    @Test
    public void testGetMinStepsDP_n1000() {
        int steps = MinStepsToOne.getMinSteps(1000);
        assertEquals(9, steps);
    }
    
    @Test
    public void testGetMinStepsTab_n100() {
        int steps = MinStepsToOne.getMinStepsTab(100);
        assertEquals(7, steps);
    }
    
    @Test
    public void testGetMinStepsTab_n1000() {
        int steps = MinStepsToOne.getMinStepsTab(1000);
        assertEquals(9, steps);
    }
    
    @Test
    public void testGetMinStepsTab_n10000() {
        int steps = MinStepsToOne.getMinStepsTab(10000);
        assertEquals(14, steps);
    }
}
