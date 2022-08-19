import java.util.Scanner;

public class FizzBuzz {
    public static String readNumberToWord(int number) {
        boolean isDiv3 = number % 3 == 0;
        boolean isDiv5 = number % 5 == 0;
        boolean isDiv3And5 = isDiv3 && isDiv5;
        String word;
        if (isDiv3And5) {
            word = "FizzBuzz";
        } else if (isDiv3) {
            word = "Fizz";
        } else if (isDiv5) {
            word = "Buzz";
        } else {
            word = readNumberToWordNotFizzBuzz(number);
        }
        return word;
    }

    public static String readNumberToWordNotFizzBuzz(int number) {
        String word ="";
        int first = number / 10;
        int second = number % 10;
        if (number < 10) {
            word = readZeroToNine(second);
        } else if (number < 100) {
            word = readZeroToNine(first) + " " + readZeroToNine(second);
        }
        return word;
    }

    public static String readZeroToNine(int second) {
        String word = "";
        switch (second) {
            case 0:
                word = "Không";
                break;
            case 1:
                word = "Một";
                break;
            case 2:
                word = "Hai";
                break;
            case 3:
                word = "Fizz";
                break;
            case 4:
                word = "Bốn";
                break;
            case 5:
                word = "Buzz";
                break;
            case 6:
                word = "Sáu";
                break;
            case 7:
                word = "Bảy";
                break;
            case 8:
                word = "Tám";
                break;
            case 9:
                word = "Chín";
                break;
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.println("Nhập số: ");
            number = sc.nextInt();
        }while (number<0 || number>99);
        System.out.println(readNumberToWord(number));
    }
}
