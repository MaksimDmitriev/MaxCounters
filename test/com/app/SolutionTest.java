package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void noSetAllToMax() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 1, 0, 1, 0}, solution.solution(5, new int[]{1, 2, 4, 1}));
    }

    @Test
    public void setAllToMaxOnce() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{}, solution.solution(7, new int[]{1, 2, 4, 50, 4, 3}));
    }

    @Test
    public void setAllToMaxTwice() {
        Solution solution = new Solution();
        fail("Implement it");
    }

    @Test
    public void small() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, solution.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
        // WRONG ANSWER  (got [3, 2, 3, 4, 2] expected [3, 2, 2, 4, 2])
    }
}