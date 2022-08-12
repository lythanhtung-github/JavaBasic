package stopwatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random()*100);
        }
        LocalTime start = LocalTime.now();
        numbers = selectionSort(numbers);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        int timeSort = stopWatch.getElapsedTime();
        System.out.printf("Thời gian sắp xếp 100.000 theo thuật toán Selection Sort là: %s milisecond giây", timeSort);
    }

    public static int[] selectionSort(int...array){
        for (int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if (array[j]<array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
