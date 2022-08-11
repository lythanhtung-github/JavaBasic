import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, index;
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("Mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nNhập phần tử muốn thêm vào mảng: ");
        number = sc.nextInt();
        do {
            System.out.println("Nhập vị trí trong mảng: ");
            index = sc.nextInt();
        } while (index < 0 || index > 9);

        int[] numbersAfterIndex = new int[10];
        int count = 0;
        if (numbers[index] == 0) {
            numbers[index] = number;
        } else {
            for (int i = (index + 1); i < numbers.length; i++) {
                numbersAfterIndex[count] = numbers[i];
                count++;
            }

            for (int i = (index + 1), j = 0; i < numbers.length; i++, ++j) {
                numbers[i] = numbersAfterIndex[j];
            }
        }
        System.out.printf("Mảng sau khi thêm %d: ", number);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}