package com.app;

public class Solution {

    // N counters
    // M elements in the array A. M > 0

    // if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
    // if A[K] = N + 1 then operation K is max counter.

    // Assume that:
    // N and M are integers within the range [1..100,000];
    // each element of array A is an integer within the range [1..N + 1].


    // Time and space
    // expected worst-case time complexity is O(N+M);
    // expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];

        int max = 0;
        int increment = 0;

        for (int elem : A) {
            if (elem <= N) {
                counters[elem - 1]++;
                if (max < counters[elem - 1]) {
                    max = counters[elem - 1];
                }
            } else {
                increment = max;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < increment) {
                counters[i] += (counters[i] - increment);
            }
        }

        return counters;
    }

    public int[] solution2(int N, int[] A) {
        int[] result = new int[N];
        int maximum = 0;
        int resetLimit = 0;

        for (int K = 0; K < A.length; K++) {


            if (A[K] >= 1 && A[K] <= N) {
                if (result[A[K] - 1] < resetLimit) {
                    result[A[K] - 1] = resetLimit + 1;
                } else {
                    result[A[K] - 1]++;
                }

                if (result[A[K] - 1] > maximum) {
                    maximum = result[A[K] - 1];
                }
            } else {
                // inefficiency here
                //for (int i = 0; i < result.Length; i++)
                //    result[i] = maximum;
                resetLimit = maximum;
            }
        }

        for (int i = 0; i < result.length; i++)
            result[i] = Math.max(resetLimit, result[i]);

        return result;
    }
}
