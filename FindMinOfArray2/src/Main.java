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

        int[][] numbers = new int[row][col];

        for (int i = 0; i  < row; i ++){
            for(int j = 0; j < col; j ++){
                System.out.printf("Màng phần tử %d - Nhập phần tử thứ %d: ", i, j);
                numbers[i][j]= sc.nextInt();
            }
        }
        int indexI = 0, indexJ = 0;
        int min = numbers[0][0];
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-4d", numbers[i][j]);
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
            System.out.println();
        }
        System.out.printf("Gíá trị nhỏ nhất của mảng là %d ở tọa độ %d-%d:", min, indexI, indexJ);
    }

}