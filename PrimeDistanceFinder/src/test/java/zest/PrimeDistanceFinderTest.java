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
    void alotaPrimesTest() {
        int[] nums = {10, 2, 7, 3, 5, 11};
        assertEquals(1, PrimeDistanceFinder.findSmallestPrimeDistance(nums));
    }

    @Test
    void negativeTest() {
        int[] nums = {-5, -3, 2, 7};
        assertEquals(5, PrimeDistanceFinder.findSmallestPrimeDistance(nums)); /*since there are no negative primes*/
    }

}
