package selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,6,3,65,7,4,2,45,43,534,54,3} ;
        System.out.println("List before sort: ");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("List after sort: ");
        printArray(numbers);
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_id]) {
                    min_id = j;
                }
            }
            if (min_id != i){
                int temp = numbers[i];
                numbers[i] = numbers[min_id];
                numbers[min_id] = temp;
            }
        }
    }
    public static void printArray(int[] numbers){
        for (int element: numbers){
            System.out.printf("%-4s",element);
        }
        System.out.println();
    }
}
