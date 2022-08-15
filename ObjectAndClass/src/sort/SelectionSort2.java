package sort;

import java.util.Arrays;

public class SelectionSort2 {

    public static void main(String[] args) {
        int[] numbers = {23, 2, 3, 213, 2, 23, 4, 23, 23, 423, 4, 23, 432, 4, 234, 23, 423};

//        for (int i = 0; i < numbers.length - 1; i++) {
//            int min_id = i;
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[min_id] > numbers[j]) {
//                    min_id = j;
//                }
//            }
//            if (min_id != i) {
//                int temp = numbers[i];
//                numbers[i] = numbers[min_id];
//                numbers[min_id] = temp;
//            }
//        }

        for (int i = 0; i < numbers.length -1; i++){
            int min_id = i;
            for (int j = i+ 1; j < numbers.length; j++){
                if (numbers[min_id]>numbers[j]){
                    min_id = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min_id];
            numbers[min_id] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
