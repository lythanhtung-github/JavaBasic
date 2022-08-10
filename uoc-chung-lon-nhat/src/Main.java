import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Nhập số thứ nhất: ");
        num1 = sc.nextInt();

        System.out.println("Nhập số thứ hai: ");
        num2 = sc.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if (num1 == 0 ){
            if (num2 == 0){
                System.out.println("Không có ước chung lớn nhất");
            }
            else {
                System.out.printf("Uớc chung lớn nhất là %d", num2);
            }
        } else if (num2 == 0){
            System.out.printf("Uớc chung lớn nhất là %d", num1);
            } else {
                while( num1 != num2 ) {
                    if (num1 > num2) {
                        num1 = num1 - num2;
                    } else {
                        num2 = num2- num1;
                    }
                }
                System.out.printf("Uớc chung lớn nhất là %d", num1);
            }

        }
}