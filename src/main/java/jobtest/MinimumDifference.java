package jobtest;

/**
 * Minimum Difference
 * <p>
 * Given an array of distinct integers, find the minimum absolute difference
 * between any two elements.
 * <p>
 * Input: An array of n integers where n ≥ 2
 * Output: The smallest absolute difference between any pair of elements
 * <p>
 * Example:
 * Input:  [3, 8, 15, 1, 9]
 * Output: 2
 * <p>
 * Explanation: The minimum difference is |3 - 1| = 2
 */

public class MinimumDifference {

    public int getMinimumDifference(final int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        return 0;
    }
}
