import java.util.Scanner;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String ZERO = "Zero";
    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final String FOUR = "Four";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";

    public static String readNumberToWord(int number) {
        boolean isDiv3 = number % 3 == 0;
        boolean isDiv5 = number % 5 == 0;
        boolean isNotHave3 = number / 10 != 3 && number % 10 != 3;
        boolean isNotHave5 = number / 10 != 5 && number % 10 != 5;
        boolean isDiv3And5 = isDiv3 && isDiv5;
        if (isDiv3And5) {
            return FIZZ_BUZZ;
        }
        if (isDiv3 && isNotHave5) {
            return FIZZ;
        }
        if (isDiv5 && isNotHave3) {
            return BUZZ;
        }
        return readNumberToWordNotFizzBuzz(number);
    }

    public static String readNumberToWordNotFizzBuzz(int number) {
        int first = number / 10;
        int second = number % 10;
        if (number < 10) {
            return readZeroToNine(second);
        }
        return String.format("%s %s", readZeroToNine(first), readZeroToNine(second));
    }

    public static String readZeroToNine(int number) {
        String word = "";
        switch (number) {
            case 0:
                word = ZERO;
                break;
            case 1:
                word = ONE;
                break;
            case 2:
                word = TWO;
                break;
            case 3:
                word = FIZZ;
                break;
            case 4:
                word = FOUR;
                break;
            case 5:
                word = BUZZ;
                break;
            case 6:
                word = SIX;
                break;
            case 7:
                word = SEVEN;
                break;
            case 8:
                word = EIGHT;
                break;
            case 9:
                word = NINE;
                break;
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number: ");
            number = sc.nextInt();
        } while (number < 0 || number > 99);
        System.out.println(readNumberToWord(number));
    }
}
