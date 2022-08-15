package bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[]numbers = {1,4,2,787,5,44,67,5,6,57,23,45,556,3,43,5,345,34,534,5,34};
        for(int element:numbers){
            System.out.print(element + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        for(int element:numbers){
            System.out.print(element + " ");
        }
    }
    public static void bubbleSort(int[]numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = numbers.length -1; j>i; j--){
                if (numbers[j]<numbers[j-1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j -1];
                    numbers[j - 1] = temp;
                }
            }
        }
    }
}
