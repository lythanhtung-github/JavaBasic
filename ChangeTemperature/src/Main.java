import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double fTemp;
        double cTemp;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Fahrenheit: ");
                    fTemp = sc.nextDouble();
                    cTemp = (fTemp - 32) / 1.8;
                    System.out.printf("%f độ F bằng %f độ C \n", fTemp, cTemp);
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    System.out.println("Enter your Celsius");
                    cTemp = sc.nextDouble();
                    fTemp = (cTemp * 1.8) + 32;
                    System.out.printf("%f độ C bằng %f độ F \n", cTemp, fTemp);
                    System.out.println("---------------------------------------");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Your choice is not valid");
                    System.out.println("---------------------------------------");
                    break;
            }

        } while (choice != 0);
    }
}