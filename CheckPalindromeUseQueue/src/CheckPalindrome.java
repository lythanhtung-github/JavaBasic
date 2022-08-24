import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Character> palindromeQueue = new LinkedList<>();
        Stack<Character> palindromeStack = new Stack<>();

        System.out.println("Nhập chuỗi kiểm tra: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            palindromeQueue.add(str.charAt(i));
            palindromeStack.push(str.charAt(i));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (palindromeQueue.remove() != palindromeStack.pop()) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) System.out.printf("%s là chuỗi Palindrome", str);
        else System.out.printf("%s không phải là Palindrome", str);
    }
}
