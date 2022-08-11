import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers;
        int max;
        int size;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập số tỉ phú: ");
            size = sc.nextInt();
        } while (size < 0 || size > 20);
        numbers = new int[size];

        System.out.println("Nhập tài sản các tỉ phú");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.printf("Tỉ phú có tài sản lớn nhất là: %d", max);
    }
}