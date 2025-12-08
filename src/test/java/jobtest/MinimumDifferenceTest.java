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

    @Test
    public void inputIs10And5And3_theResultIs2() {
        int difference = minimumDifference.getMinimumDifference(new int[]{10, 5, 3});
        assertEquals(2, difference);
    }

    @Test
    public void inputIs10And5And3_theResultIs2_withSorting() {
        int difference = minimumDifference.getMinimumDifferenceWithSorting(new int[]{10, 5, 3});
        assertEquals(2, difference);
    }

    @Test
    public void inputIsMinus10And5AndMinus3_theResultIs7_withSorting() {
        assertEquals(7, minimumDifference.getMinimumDifferenceWithSorting(new int[]{-10, 5, -3}));
        assertEquals(7, minimumDifference.getMinimumDifference(new int[]{-10, 5, -3}));
    }

    @Test
    public void inputIs30And20And10And15And5_theResultIs5() {
        int difference = minimumDifference.getMinimumDifference(new int[]{30, 20, 10, 15, 5});
        assertEquals(5, difference);
    }
}
