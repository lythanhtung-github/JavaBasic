import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bracketStack = new Stack<>();

        System.out.println("Nhập biểu thức muốn kiểm tra: ");
        String str = scanner.nextLine();

        boolean isExpressions = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bracketStack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                if (bracketStack.size() == 0) {
                    isExpressions = false;
                    break;
                }
                bracketStack.pop();
            }
        }
        if (isExpressions && bracketStack.isEmpty()) System.out.printf("%s là biểu thức", str);
        else System.out.printf("%s không phải là biểu thức", str);
    }
}
