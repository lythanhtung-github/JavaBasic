public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,4,3,-2,4,5,23,34,3,4,23,34,2,-9};
        int min = findMin(numbers);
        System.out.printf("Giá trị nhỏ nhất của mảng là %d",min);
    }

    public static int findMin(int[] array){
        int min  = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}