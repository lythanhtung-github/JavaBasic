package binary_search_recursive;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] numbers = inputArray();
        System.out.printf("Array: %11s", "");
        printArray(numbers);

        sortArray(numbers);

        System.out.print("Array after sort: ");
        printArray(numbers);

        int key = inputValue();

        int indexSearch = binarySearch(numbers, 0, numbers.length, key);
        if (indexSearch == -1) {
            System.out.println("Do not find!");
        } else {
            System.out.printf("Position of %s is %s ", key, indexSearch);
        }
    }

    public static int inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search value: ");
        return sc.nextInt();
    }

    public static int inputSize() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter array size: ");
            size = sc.nextInt();
            if (size < 0) {
                System.out.println("Please enter array size");
            }
        } while (size < 0);
        return size;
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        int size = inputSize();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter value %s: ", i);
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static int binarySearch(int[] numbers, int left, int right, int value) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] > value) {
                right = mid - 1;
                return binarySearch(numbers, left, right, value);
            } else {
                left = mid + 1;
                return binarySearch(numbers, left, right, value);
            }
        }
        return -1;
    }

    public static void sortArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }

    public static void printArray(int[] numbers) {
        for (int element : numbers) {
            System.out.printf("%4s", element);
        }
        System.out.println();
    }
}
