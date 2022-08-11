import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 4, 2, 4, 2, 45, 2, 5, 7, 5, 7, 5, 65, 4, 2, 3, 4, 34, 3, 4, 8};
        System.out.println("Nhập phần tử muốn xóa");
        int num = sc.nextInt();

//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (num == numbers[i]){
//                for(int j = i; j < numbers.length; j++){
//                    numbers[j] = numbers[j+1];
//                    count++;
//                }
//            }
//        }
//        for (int i = 0 ; i < numbers.length - count ; i++){
//            System.out.print(numbers[i] + " ");
//        }

        int count;
        int index;
        for (count = index = 0; index < numbers.length; index++) {
            if (numbers[index] != num) {
                numbers[count] = numbers[index];
                count++;
            }
        }

        for (int i = 0 ; i < count ; i++){
            System.out.print(numbers[i] +" ");
        }
    }

}