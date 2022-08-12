import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        do {
            System.out.println("Nhập số dòng cho mảng: ");
            row = sc.nextInt();
            System.out.println("Nhập số cột cho mảng: ");
            col = sc.nextInt();
        } while (row < 0 || col < 0);

        double[][] numbers = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Màng phần tử %d - Nhập phần tử thứ %d: ", i, j);
                numbers[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Mảng là: ");
        System.out.print("    ");
        for (int i = 0; i < col; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n------------------------------------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%-2d |", i);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%3f", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int colSum;
        double sumCol;
        colSum = inputColSum(col, sc);
        sumCol = calSumCol(colSum, numbers);
        System.out.printf("Tổng các phần tử của cột %d là : %f", colSum, sumCol);
    }

    public static int inputColSum(int col, Scanner sc) {
        int colSum;

        do {
            System.out.println("Nhập vị trí cột bạn muốn tính tổng: ");
            colSum = sc.nextInt();
            if (colSum < 0) {
                System.out.println("Vị trí cột không âm - Vui lòng nhập lại: ");
            }
            if (colSum > col) {
                System.out.printf("Vị trí cột không vượt quá %d - Vui lòng nhập lại: \n", col);
            }
        } while (colSum < 0 || colSum > col);
        return colSum;
    }

    public static double calSumCol(int colSum, double[][] array) {
        double sumCol = 0;
        for (int i = 0; i < array.length; i++) {
            sumCol += array[i][colSum];
        }
        return sumCol;
    }
}