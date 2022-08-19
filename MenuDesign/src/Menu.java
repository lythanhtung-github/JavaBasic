import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            choice = printMenu(sc);
            switch (choice) {
                case 1: {
                    boolean isLogin = true;
                    while (isLogin) {
                        choice = printMenuPrint(sc);
                        switch (choice) {
                            case 1: {
                                System.out.println("You are handsome");
                                break;
                            }
                            case 2: {
                                isLogin = false;
                                break;
                            }
                            default: {
                                System.out.println("No choice!");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Exit program");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("No choice!");
                    break;
            }
        } while (true);
    }

    public static int printMenu(Scanner sc) {
        System.out.println("▬▬▬▬▬▬▬▬▬▬MENU▬▬▬▬▬▬▬▬▬▬");
        System.out.printf("%-35s▐\n", "▌");
        System.out.printf("%s%21s%14s\n", "▌", "1. Login", "▐");
        System.out.printf("%s%20s%15s\n", "▌", "2. Exit", "▐");
        System.out.printf("%-35s▐\n", "▌");
        System.out.println("▬▬▬▬▬▬▬▬▬▬MENU▬▬▬▬▬▬▬▬▬▬");

        System.out.println("Enter your choice: ");
        return sc.nextInt();
    }

    public static int printMenuPrint(Scanner sc) {
        System.out.println("▬▬▬▬▬▬▬▬▬▬MENU▬▬▬▬▬▬▬▬▬▬");
        System.out.printf("%-35s▐\n", "▌");
        System.out.printf("%s%21s%14s\n", "▌", "1. Print", "▐");
        System.out.printf("%s%22s%13s\n", "▌", "2. Return", "▐");
        System.out.printf("%-35s▐\n", "▌");
        System.out.println("▬▬▬▬▬▬▬▬▬▬MENU▬▬▬▬▬▬▬▬▬▬");

        System.out.println("Enter your choice: ");
        return sc.nextInt();
    }
}
