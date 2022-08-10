import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime;
        System.out.println("Nhập số bạn muốn kiểm tra: ");
        prime = sc.nextInt();
        if (prime <2){
            System.out.printf("%d không phải là số nguyên tố", prime);
        } else{
            int count =0;
            for (int i = 1; i <= prime; i++ ){
                if (prime % i == 0) {
                    count = count + 1;
                }
            } 
            if (count == 2){
                System.out.printf("%d là số nguyên tố", prime);
            } else {
                System.out.printf("%d không phải là số nguyên tố", prime);
            }
        }
    }
}