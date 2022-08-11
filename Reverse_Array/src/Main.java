import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers;
        int size;
        do {
            System.out.println("Nhập kích thước của mảng: ");
            size = sc.nextInt();
        } while (size < 0);

        numbers = new int[size];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Các phần tử của mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for (int i = 0; i < numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 -i];
            numbers[numbers.length - 1 -i] = temp;
        }
        System.out.println();
        System.out.println("Mảng đảo ngược là: ");
        for (int i = 0; i <numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}