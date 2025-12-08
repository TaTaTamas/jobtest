package jobtest;

import java.util.Arrays;
import java.util.List;

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
        int secondSmallestNumber = numbers[1];
        for (int i = 2; i < numbers.length; i++) {
            if (secondSmallestNumber < firstSmallestNumber) {
                int temp = firstSmallestNumber;
                firstSmallestNumber = secondSmallestNumber;
                secondSmallestNumber = temp;
            }
            if (numbers[i] < firstSmallestNumber) {
                secondSmallestNumber = firstSmallestNumber;
                firstSmallestNumber = numbers[i];
            } else if (numbers[i] < secondSmallestNumber) {
                secondSmallestNumber = numbers[i];
            }
        }
        return Math.abs(firstSmallestNumber - secondSmallestNumber);
    }

    public int getMinimumDifferenceWithSorting(final int[] numbers) {
        verifyParameters(numbers);
        List<Integer> sortedNumbers = Arrays.stream(numbers).boxed().sorted().toList();
        return Math.abs(sortedNumbers.get(0) - sortedNumbers.get(1));
    }

    private void verifyParameters(final int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException();
        }
    }
}
