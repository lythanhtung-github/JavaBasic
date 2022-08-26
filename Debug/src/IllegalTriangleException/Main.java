package IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RightTriangle rightTriangle = new RightTriangle();

        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = scanner.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = scanner.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = scanner.nextInt();

            try {
                rightTriangle.checkRightTriangle(a, b, c);
            } catch (IllegalRightTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: khong dung dinh dang!");
        }
    }
}
