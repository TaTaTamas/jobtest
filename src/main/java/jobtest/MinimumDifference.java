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

    public int getMinimumDifference(final int[] numbers) {
        verifyParameters(numbers);

        int firstSmallestNumber = numbers[0];
        int secondSmallestNumber  = numbers[1];
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < firstSmallestNumber) {
                firstSmallestNumber = numbers[i];
            } else if (numbers[i] < secondSmallestNumber) {
                secondSmallestNumber = numbers[i];
            }
        }


        return Math.abs(firstSmallestNumber - secondSmallestNumber);
    }

    private void verifyParameters(final int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException();
        }
    }
}
