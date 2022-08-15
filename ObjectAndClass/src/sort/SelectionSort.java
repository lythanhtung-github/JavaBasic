package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int  numbers[] = {1, 9, 15, 22, 33, 4, 5, 34, 35, 12, 11, 13, 5, 6, 100};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

}
