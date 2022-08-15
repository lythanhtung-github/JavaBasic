package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 34, 35, 12, 11, 13, 5, 6};

        System.out.println("Mảng ban đầu:");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
