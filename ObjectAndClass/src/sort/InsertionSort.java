package sort;

public class InsertionSort {

    public static void main(String main[]) {
        int numbers[] = {1, 2, 4, 5, 34, 35, 12, 11, 13, 5, 6};

        System.out.println("Mảng ban đầu:");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int i = 1; i < numbers.length; ++i) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }

        System.out.println("Mảng sau khi sắp xếp:");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


}
