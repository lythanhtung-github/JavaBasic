import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số cần đọc");
            number = sc.nextInt();
        } while (number < 0 || number > 1000);
        readWord(number);
    }

    public static String _0_9(int number) {
        String word = null;
        switch (number) {
            case 0:
                word = "Zero";
                break;
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
        }
        return word;
    }

    public static String _10_19(int number) {
        String word = null;
        switch (number) {
            case 0:
                word = "Ten";
                break;
            case 1:
                word = "Eleven";
                break;
            case 2:
                word = "Twelve";
                break;
            case 3:
                word = "Thirteen";
                break;
            case 4:
                word = "Fourteen";
                break;
            case 5:
                word = "Fifteen";
                break;
            case 6:
                word = "Sixteen";
                break;
            case 7:
                word = "Seventeen";
                break;
            case 8:
                word = "Eighteen";
                break;
            case 9:
                word = "Nineteen";
                break;
        }
        return word;
    }

    public static String _20_99(int second, int third) {
        String word = null;
        switch (second) {
            case 2: {
                if (third == 0) {
                    word = "Twenty";
                } else {
                    word = "Twenty" + " " + _0_9(third);

                }
                break;
            }
            case 3: {
                if (third == 0) {
                    word = "Thirty";
                } else {
                    word = "Thirty" + " " + _0_9(third);
                }
                break;
            }
            case 4: {
                if (third == 0) {
                    word = "Forty";
                } else {
                    word = "Forty" + " " + _0_9(third);
                }
                break;
            }
            case 5: {
                if (third == 0) {
                    word = "Fifty";
                } else {
                    word = "Fifty" + " " + _0_9(third);
                }
                break;
            }
            case 6: {
                if (third == 0) {
                    word = "Sixty";
                } else {
                    word = "Sixty" + " " + _0_9(third);
                }
                break;
            }
            case 7: {
                if (third == 0) {
                    word = "Seventy";
                } else {
                    word = "Seventy" + " " + _0_9(third);
                }
                break;
            }
            case 8: {
                if (third == 0) {
                    word = "Eighty";
                } else {
                    word = "Eighty" + " " + _0_9(third);
                }
                break;
            }
            case 9: {
                if (third == 0) {
                    word = "Ninety";
                } else {
                    word = "Ninety" + " " + _0_9(third);
                }
                break;
            }
        }
        return word;
    }

    public static String _100_999(int first, int second, int third) {
        String word;
        if (second == 0) {
            if (third == 0) {
                word = _0_9(first) + " Hundred";
            } else {
                word = _0_9(first) + " Hundred and " + _0_9(third);
            }
        } else if (second == 1) {
            word = _0_9(first) + " Hundred " + _10_19(third);
        } else {
            word = _0_9(first) + " Hundred " + _20_99(second, third);
        }
        return word;
    }

    public static void readWord(int number) {
        String wordStr;
        int first, second, third;
        first = number / 100;
        second = (number % 100) / 10;
        third = number % 10;
        if (number < 10) {
            wordStr = _0_9(third);
            System.out.printf("%d được đọc là %s", number, wordStr);
        } else if (number < 20) {
            wordStr = _10_19(third);
            System.out.printf("%d được đọc là %s", number, wordStr);
        } else if (number < 100) {
            wordStr = _20_99(second, third);
            System.out.printf("%d được đọc là %s", number, wordStr);
        } else {
            wordStr = _100_999(first, second, third);
            System.out.printf("%d được đọc là %s", number, wordStr);
        }
    }
}