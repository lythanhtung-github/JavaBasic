package absolute_number_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}
