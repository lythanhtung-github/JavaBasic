import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void isLeapYear(){
        int year = 2018;
        boolean result = NextDayCalculator.isLeapYear(year);
        assertFalse(result);
    }

    @Test
    void maxDayOfMonth(){
        int year = 2018;
        int month = 1;
        int expected = 31;
        int result = NextDayCalculator.maxDayOfMonth(month, year);
        assertEquals(expected,result);
    }

    @Test
    void calculatorNextDay1(){
        int year = 2018;
        int month = 1;
        int day = 1;
        String result = NextDayCalculator.calculatorNextDay(day, month, year);
        String expected = "2/1/2018";
        assertEquals(expected, result);
    }

    @Test
    void calculatorNextDay2(){
        int day = 31;
        int month = 1;
        int year = 2018;

        String result = NextDayCalculator.calculatorNextDay(day, month, year);
        String expected = "1/2/2018";
        assertEquals(expected, result);
    }

    @Test
    void calculatorNextDay3(){
        int day = 30;
        int month = 4;
        int year = 2018;

        String result = NextDayCalculator.calculatorNextDay(day, month, year);
        String expected = "1/5/2018";
        assertEquals(expected, result);
    }

    @Test
    void calculatorNextDay4(){
        int day = 28;
        int month = 2;
        int year = 2018;

        String result = NextDayCalculator.calculatorNextDay(day, month, year);
        String expected = "1/3/2018";
        assertEquals(expected, result);
    }

    @Test
    void calculatorNextDay5(){
        int day = 29;
        int month = 2;
        int year = 2020;

        String result = NextDayCalculator.calculatorNextDay(day, month, year);
        String expected = "1/3/2020";
        assertEquals(expected, result);
    }

    @Test
    void calculatorNextDay6(){
        int day = 31;
        int month = 12;
        int year = 2018;

        String result = NextDayCalculator.calculatorNextDay(day, month, year);
        String expected = "1/1/2019";
        assertEquals(expected, result);
    }
}