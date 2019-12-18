package us.inest.app.dcp.heap;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinHeapTest {
    @Test
    public void testHeap() throws Exception {
        MinHeap heap = new MinHeap();
        int[] arr = new int[] {3, 1, -1, 2, -4, 9, 1, 2};
        
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        
        assertEquals(-4, heap.peek());
        
        int min = heap.remove();
        assertEquals(-4, min);
        
        assertEquals(-1, heap.peek());
        
        heap.add(-2);
        assertEquals(-2, heap.peek());
    }
}
