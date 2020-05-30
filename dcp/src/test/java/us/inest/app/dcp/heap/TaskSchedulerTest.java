package us.inest.app.dcp.heap;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskSchedulerTest {
    @Test
    public void testLeastIntervals() {
        char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;
        int intervals = TaskScheduler.leastIntervals(tasks, n);
        assertEquals(8, intervals); // A -> B -> idle -> A -> B -> idle -> A -> B
    }
}
