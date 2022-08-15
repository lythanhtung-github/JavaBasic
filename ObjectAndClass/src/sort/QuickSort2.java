package sort;

public class QuickSort2 {

    int partition(int numbers[], int left, int right) {

        int key = numbers[left];
        int i = (left + 1);
        int j = right;
//        do {
//            if (i <= j) {
//                while (numbers[i] <= key) {
//                    i++;
//                }
//                while (numbers[j] > key) {
//                    j--;
//                }
//            }
//        } while (i <= j);

        while (i <= j){
                while (numbers[i] <= key) {
                    i++;
                }
                while (numbers[j] > key) {
                    j--;
            }
        }

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        return j;
    }

    void sort(int numbers[], int left, int right) {
        if (left < right) {

            int key = partition(numbers, left, right);

            sort(numbers, left, key - 1);
            sort(numbers, key + 1, right);
        }
    }

    static void printArray(int numbers[]) {
        int n = numbers.length;
        for (int i = 0; i < n; ++i)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = {1, 9, 15, 22, 33, 4, 5, 34, 35, 12, 11, 13, 5, 6, 100};

        System.out.println("Mảng ban đầu:");
        printArray(numbers);

        QuickSort ob = new QuickSort();
        ob.sort(numbers, 0, numbers.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(numbers);
    }

}
