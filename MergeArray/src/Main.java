import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amountNumbers1, amountNumbers2;

        do {
            System.out.println("Nhập số phần tử cho mảng thứ nhất: ");
            amountNumbers1 = sc.nextInt();
        } while (amountNumbers1 < 0 || amountNumbers1 > 4);

        int[] numbers1 = new int[amountNumbers1];
        for (int i = 0; i < amountNumbers1; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d trong mảng 1: \n", i + 1);
            numbers1[i] = sc.nextInt();
        }

        do {
            System.out.println("Nhập số phần tử cho mảng thứ hai: ");
            amountNumbers2 = sc.nextInt();
        } while (amountNumbers2 < 0 || amountNumbers2 > 4);
        int[] numbers2 = new int[amountNumbers2];
        for (int i = 0; i < amountNumbers2; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d trong mảng 2: \n", i + 1);
            numbers2[i] = sc.nextInt();
        }

        int amountNumbers3 = amountNumbers1 + amountNumbers2;
        int[] numbers3 = new int[amountNumbers3];

        for (int i = 0; i < amountNumbers1; i++) {
            numbers3[i] = numbers1[i];
        }

        for (int i = amountNumbers1, j = 0; i < amountNumbers3; i++, j++) {
            numbers3[i] = numbers2[j];
        }

        System.out.println("Mảng 3: ");
        for (int i = 0; i < amountNumbers3; i++) {
            System.out.print(numbers3[i] + " ");
        }
    }
}