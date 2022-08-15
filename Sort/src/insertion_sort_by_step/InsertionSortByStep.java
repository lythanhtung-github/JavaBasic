package insertion_sort_by_step;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter list size: ");
            size = sc.nextInt();
            if (size < 0) {
                System.out.println("Please enter list size!");
            }
        } while (size < 0);

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " values: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Value " + i + " ");
            numbers[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("List before sort: ");
        printList(numbers);

        insertionSort(numbers);

        System.out.println("List after sort: ");
        printList(numbers);
    }

    public static void printList(int[] numbers) {
        for (int element : numbers) {
            System.out.printf("%-5s", element);
        }
        System.out.println();
    }

    public static void insertionSort(int[] numbers) {
        boolean needNextPass = true;
        for (int i = 1; i < numbers.length; i++) {
            needNextPass = false;
            int key = numbers[i];
            int j;
            for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
                System.out.println("Swap "+ numbers[j+1] + " and "+numbers[j]);
                numbers[j + 1] = numbers[j];
                needNextPass = true;
            }
            numbers[j + 1] = key;
        }

        if (needNextPass == false) {
            System.out.println("Array may be sorted and next pass not needed");
        }
    }

}
