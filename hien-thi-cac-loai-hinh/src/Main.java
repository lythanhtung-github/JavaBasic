import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Rectangle");
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println();
                    break;
                case 2: {
                    System.out.println("Square triangle");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("\n");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("Isosceles triangle");
                    int k = 0;
                    for (int i = 1; i <= 5; ++i, k = 0) {
                        for (int j = 1; j <= 5 - i; ++j) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4:
                    System.out.println("Exit program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}