package jobtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class MinimumDifferenceTest {

    MinimumDifference minimumDifference;

    @BeforeEach
    public void setUp() {
        minimumDifference = new MinimumDifference();
    }

    @Test
    public void theInputParameterSetSizeLessThanTwo_illegalArgumentExceptionThrown() {
        assertThrows(IllegalArgumentException.class, () -> minimumDifference.getMinimumDifference(new int[]{42}));
    }

    @Test
    public void inputIs5And3_theResultIs2() {
        int difference = minimumDifference.getMinimumDifference(new int[]{5, 3});
        assertEquals(2, difference);
    }

    @Test
    public void inputIs3And5_theResultIs2() {
        int difference = minimumDifference.getMinimumDifference(new int[]{3, 5});
        assertEquals(2, difference);
    }
}
