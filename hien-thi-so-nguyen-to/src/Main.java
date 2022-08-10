import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int countPrime =0;
        int count =0;
        System.out.println("Nhập số nguyên tố bạn muốn in ra: ");
        number = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n",number);
        for (int num = 2; ; num++){
            if (countPrime < number){
                for (int i = 1; i <= num; i++){
                    if (num % i ==0){
                        ++count;
                    }
                }
                if (count == 2)
                {
                    System.out.println(num);
                   ++countPrime;
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}