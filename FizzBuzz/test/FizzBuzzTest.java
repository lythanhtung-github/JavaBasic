import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void readNumberToWord1() {
        int number = 3;
        String result = FizzBuzz.readNumberToWord(number);
        String expected = "Fizz";

        assertEquals(expected, result);
    }

    @Test
    void readNumberToWord2() {
        int number = 5;
        String result = FizzBuzz.readNumberToWord(number);
        String expected = "Buzz";
        assertEquals(expected, result);
    }

    @Test
    void readNumberToWord3() {
        int number = 15;
        String result = FizzBuzz.readNumberToWord(number);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }

    @Test
    void readNumberToWord4() {
        int number = 24;
        String result = FizzBuzz.readNumberToWord(number);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }

    @Test
    void readNumberToWordNotFizzBuzz() {
        int number = 99;
        String result = FizzBuzz.readNumberToWordNotFizzBuzz(number);
        String expected = "Chín Chín";
        assertEquals(expected, result);
    }
}