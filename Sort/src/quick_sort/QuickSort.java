package quick_sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 3, 65, 45, 43, 534, 54, 3};
        System.out.println("List before sort: ");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("List after sort: ");
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int element : numbers) {
            System.out.printf("%-4s", element);
        }
        System.out.println();
    }

    public static void quickSort(int[] numbers, int left, int right) {
        if (left < right) {
            int key = partition(numbers, left, right);
            quickSort(numbers, left, key - 1);
            quickSort(numbers, key + 1, right);
        }
    }

    public static int partition(int[] numbers, int left, int right) {

        int key = numbers[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {

            if (numbers[j] < key) {
                i++;

                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[right];
        numbers[right] = temp;

        return i + 1;
    }
}
