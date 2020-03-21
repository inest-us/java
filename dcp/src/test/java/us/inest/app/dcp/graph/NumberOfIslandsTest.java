package us.inest.app.dcp.graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    @Test
    public void numIslandsTest() {
        char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };
        int count = NumberOfIslands.numIslands(grid);
        assertEquals(3, count);
    }
}
