import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("Mảng ban đầu: %s\n", Arrays.toString(numbers));
        numbers = reverseArray(numbers);
        System.out.printf("Mảng đảo ngược: %s\n", Arrays.toString(numbers));
    }

    public static int[] reverseArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }
        return numbers;
    }
}
