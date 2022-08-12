import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, count;

        do {
            System.out.println("Nhập số lượng sinh viên trong lớp: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Số lượng sinh viên không vượt quá 30 - Vui lòng nhập lại");
            }
            if (size < 0) {
                System.out.println("Số lượng sinh viên không nhỏ hơn 0 - Vui lòng nhập lại");
            }
        } while (size < 0 || size > 30);

        int[] students = new int[size];

        for (int i = 0; i < size; i++) {
            do {
                System.out.printf("Nhập điểm cho sinh viên thứ %d: ", i + 1);
                students[i] = sc.nextInt();
                if (students[i] > 10) {
                    System.out.println("Điểm sinh viên không vượt quá 10 - Vui lòng nhập lại");
                }
                if (students[i] < 0) {
                    System.out.println("Điểm sinh viên nhỏ hơn 0 - Vui lòng nhập lại");
                }
            } while (students[i] < 0 || students[i] > 10);
        }

        System.out.println("Danh sách điểm sinh viên là: ");
        for (int element : students){
            System.out.print(element + " ");
        }
        System.out.println();

        count = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i]>=5){
                count ++;
            }
        }
        System.out.printf("Số sinh viên thi đỗ là %d ", count);
    }
}