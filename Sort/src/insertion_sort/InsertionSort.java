package insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 3, 65, 7, 4, 2, 45, 43, 534, 54, 3};
        System.out.println("List before sort: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("List after sort: ");
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int element : numbers) {
            System.out.printf("%-4s", element);
        }
        System.out.println();
    }

    public static void insertionSort(int[] numbers) {
//        for (int i = 1; i < numbers.length; i++) {
//            int key = numbers[i];
//            int j = i - 1;
//            while (j >= 0 && numbers[j] > key) {
//                numbers[j + 1] = numbers[j];
//                j--;
//            }
//            numbers[j+1] = key;
//        }

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j;
            for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = key;
        }
    }
}
