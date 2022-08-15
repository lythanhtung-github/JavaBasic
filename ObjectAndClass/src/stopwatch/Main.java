package stopwatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        LocalTime start = LocalTime.now();
        System.out.println("Thời gian bắt đầu: " + start);

        numbers = selectionSort(numbers);

        LocalTime end = LocalTime.now();
        System.out.println("Thời gian kết thúc: " + end);
        StopWatch stopWatch = new StopWatch(start, end);
        int timeSort = stopWatch.getElapsedTime();

        System.out.printf("Thời gian sắp xếp 100.000 theo thuật toán Selection Sort là: %s milisecond giây", timeSort);
    }

    public static int[] selectionSort(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_id]) {
                    min_id = j;
                }
            }
            if (min_id !=i){
                int temp = array[i];
                array[i] = array[min_id];
                array[min_id] = temp;
            }
        }
        return array;
    }
}
