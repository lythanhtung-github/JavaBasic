package binary_search;

public class BinarySearch {
    static int[] numbers = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[]numbers, int key){
        int low = 0;
        int high = numbers.length -1;
        while(high >= low){
            int mid = (high + low)/2;
            if (key < numbers[mid]){
                high = mid - 1;
            } else if (key == numbers[mid]){
                return mid;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(numbers, 2));
        System.out.println(binarySearch(numbers, 79));
        System.out.println(binarySearch(numbers, 60));
        System.out.println(binarySearch(numbers, 59));
        System.out.println(binarySearch(numbers, 1122312));

    }
}
