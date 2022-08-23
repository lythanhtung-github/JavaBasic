import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("Mảng ban đầu: %s\n", Arrays.toString(numbers));
        numbers = reverseArrayInt(numbers);
        System.out.printf("Mảng đảo ngược: %s\n", Arrays.toString(numbers));

        String str = "Ly Thanh Tung";
        System.out.printf("Chuỗi ban đầu: %s\n", str);
        str = reverseArrayString(str);
        System.out.printf("Chuỗi đảo ngược: %s\n", str);
    }

    public static int[] reverseArrayInt(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }
        return numbers;
    }

    public static String reverseArrayString(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + "");
        }
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString = newString + stack.pop();
        }
        return newString;
    }
}
