import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soTienGui, laiSuat;
        byte soThangGui;

        System.out.println("Nhập số iền gửi(VND): ");
        soTienGui = sc.nextDouble();
        if (soTienGui<0){
            System.out.println("Số tiền gửi không thể là số âm");
        }

        System.out.println("Nhập lãi suất(%): ");
        laiSuat = sc.nextDouble();

        System.out.println("Nhập số tháng gửi: ");
        soThangGui = sc.nextByte();
        if(soThangGui<0 || soThangGui>12){
            System.out.println("Tháng không hợp lệ");
        }

        double soTienLai = 0;
        for (int i = 0; i < soThangGui; i++){
            soTienLai += soTienGui * (laiSuat/100)/12 * soThangGui;
        }
        System.out.println("Số tiền lãi là : " + soTienLai);
    }
}