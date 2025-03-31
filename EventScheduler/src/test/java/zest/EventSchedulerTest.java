package zest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EventSchedulerTest {

    //empty
    @Test
    public void testEmpty() {
        int[][] events = {};
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = false;
        assertEquals(output, expected);
    }

    //None
    @Test
    public void testOne() {
        int[][] events = { {1,4} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = false;
        assertEquals(output, expected);
    }

    // No overlap
    @Test
    public void testOverlappingEvents() {
        int[][] events = { {1, 5}, {6, 7}, {8, 9} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = true;
        assertEquals(output, expected);
    }

    // Simple overlap
    @Test
    public void testOverlapping() {
        int[][] events = { {1, 5}, {4, 6}, {7, 9} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = true;
        assertEquals(output, expected);
    }

    // Not in Order false
    @Test
    public void testNotinOrderFalse() {
        int[][] events = { {7, 9}, {4, 6}, {1, 3} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = false;
        assertEquals(output, expected);
    }

    // Not in Order true
    @Test
    public void testNotinOrderTrue(){
        int[][] events = { {7, 9}, {4, 6}, {1, 5} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = true;
        assertEquals(output, expected);
    }

    // Large number overlap
    @Test
    public void testLargeOverlapping() {
        int[][] events = { {1, 5}, {4, 6}, {7, 9}, {2, 29} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = true;
        assertEquals(output, expected);
    }

    // End and start at same time
    @Test
    public void testStartEndOverlap() {
        int[][] events = { {1, 5}, {7, 9}, {9, 10} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = false;
        assertEquals(output, expected);
    }

    //Zero and Negative numbers
    @Test
    public void testNegativeAndZero() {
        int[][] events = { {0, 2}, {-1, 5}, {7, 9}, {9, 10} };
        boolean output = EventScheduler.hasConflict(events);
        boolean expected = true;
        assertEquals(output, expected);
    }

}