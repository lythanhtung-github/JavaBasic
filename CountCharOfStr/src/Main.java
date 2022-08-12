import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sample = "Insanity is doing the same thing, over and over again, but expecting different results.";
        String input;
        do {
            System.out.println("Nhập ký tự bạn muốn tìm kiếm: ");
            input = sc.nextLine();
        } while (input.length() != 1);

        char st;
        st = input.charAt(0);
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (st == sample.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện của '%s' là: %d", st, count);
    }
}