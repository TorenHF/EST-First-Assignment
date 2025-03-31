package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeDistanceFinderTest {

    @Test
    void noPrimesTest() {
        int[] nums = {4, 6, 8, 10};
        assertEquals(-1, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }

    @Test
    void singlePrimeTest() {
        int[] nums = {4, 6, 7, 8};
        assertEquals(-1, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }

    @Test
    void twoPrimesTest() {
        int[] nums = {4, 7, 10, 13};
        assertEquals(6, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }

    @Test
    void alotaprimesTest() {
        int[] nums = {10, 2, 7, 3, 5, 11};
        assertEquals(1, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }

    @Test
    void negativeTest() {
        int[] nums = {-5, -3, 2, 7};
        assertEquals(2, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }

    @Test
    void largeTest() {
        int[] nums = {2, 10, 17, 50};
        assertEquals(7, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }
}
