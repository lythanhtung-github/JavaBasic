import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        double sum;
        size = inputSize(sc);

        double[][] numbers = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Màng phần tử %d - Nhập phần tử thứ %d: ", i, j);
                numbers[i][j] = sc.nextDouble();
            }
        }
        printArray(numbers);
        sum = calSum(numbers);
        System.out.printf("Tổng các phần tử đường chéo chính của mảng là: %s", sum);
    }
    public static int inputSize(Scanner sc){
        int size;
        do {
            System.out.println("Nhập số dòng cho mảng: ");
            size = sc.nextInt();

        } while (size < 0);
        return size;
    }
    public static void printArray(double[][] numbers){
        System.out.println("Mảng là: ");
        System.out.print("    ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println("\n------------------------------------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%-2d |", i);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5s", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double calSum(double[][] numbers){
        double sum =0;
        for (int i = 0; i < numbers.length ; i ++){
            sum += numbers[i][i];
        }
        return sum;
    }
}