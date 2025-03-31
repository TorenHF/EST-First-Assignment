package zest;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntervalMergerTest {

    @Test
    public void testEmpty(){
        int [][] input = {};
        int [][] expected = {};
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSingle(){
        int [][] input = { {1, 3} };
        int [][] expected = { {1, 3} };
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }

    @Test
    public void testNoOverlap(){
        int [][] input = { {1, 2}, {3, 4}, {5, 6} };
        int [][] expected = { {1, 2}, {3, 4}, {5, 6} };
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }

    @Test
    public void testOverlapping(){
        int [][] input = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int [][] expected = { {1, 6}, {8, 10}, {15, 18} };
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }

    @Test
    public void testUnsorted(){
        int [][] input = { {5, 10}, {1, 3}, {2, 6}, {15, 18} };
        int [][] expected = { {1, 10}, {15, 18} };
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }
    @Test
    public void testUnsortedInside(){
        int [][] input = { {10, 5}, {6, 1}, };
        int [][] expected = { {1, 10},};
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }

    @Test
    public void testAdjacent(){
        int [][] input = { {1, 4}, {4, 5} };
        int [][] expected = { {1, 5} };
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }

    @Test
    public void testNegative(){
        int [][] input = { {-3, -1}, {-2, 0}, {1, 2} };
        int [][] expected = { {-3, 0}, {1, 2} };
        int [][] result = IntervalMerger.mergeIntervals(input);
        assertEquals(expected, result);
    }
}

