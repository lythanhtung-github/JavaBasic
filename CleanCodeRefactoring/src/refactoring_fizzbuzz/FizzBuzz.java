package refactoring_fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isDiv3 = number % 3 == 0;
        boolean isDiv5 = number % 5 == 0;
        if (isDiv3 && isDiv5)
            return "FizzBuzz";

        if (isDiv3)
            return "Fizz";

        if (isDiv5)
            return "Buzz";

        return number + "";
    }
}
