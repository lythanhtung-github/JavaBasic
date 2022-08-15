package bubble_sort_by_step;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter size of numbers array: ");
            size = sc.nextInt();
            if (size < 0) {
                System.out.println("Please enter list size");
            }
        } while (size < 0);

        int[] numbers = new int[size];

        System.out.println("Enter " + numbers.length + " values: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Values: " + i + ": ");
            numbers[i] = sc.nextInt();
            System.out.println();
        }

        System.out.print("Your input list: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(numbers);
    }

    public static void bubbleSortByStep(int[] numbers) {
        boolean needNextPass = true;
        for (int i = 0; i < numbers.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    System.out.println("Swap " + numbers[j] + " with " + numbers[j - 1]);
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;

                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j] + "\t");
            }

            System.out.println();
        }
    }
}
