import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] students = {"tung", "hieu", "huong", "loc", "binh", "tai", "quy", "khanh"};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên bạn muốn tìm: ");
        String name = sc.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.printf("Sinh viên '%s' ở vị trí '%d' trong lớp", students[i], i + 1);
                break;
            } else {
                System.out.printf("Không có sinh viên '%s' trong lớp", students[i]);
                break;
            }
        }
    }
}