package jobtest;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class MinimumDifferenceTest {

    @Test
    public void theInputParameterSetSizeLessThanTwo_illegalArgumentExceptionThrown() {
        MinimumDifference minimumDifference = new MinimumDifference();
        assertThrows(IllegalAccessException.class, () -> minimumDifference.getMinimumDifference(new int[]{42}));
    }
}
