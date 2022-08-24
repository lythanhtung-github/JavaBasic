import java.util.Scanner;
import java.util.Stack;

public class BinaryDecimal {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương:");
        int number = sc.nextInt();

        while (number > 0) {
            int mod = number % 2;
            stack.push(mod);
            number = number/2;
        }

        System.out.println("Số nhị phân là: ");

        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.pop());
        }
    }
}
