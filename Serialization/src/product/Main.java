package product;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ProductManager productManager = ProductManager.getInstance();
        productManager.add(1, "Gạo", "Việt Nam", 50000);
        productManager.add(2, "Gạo2", "Việt Nam", 50000);
        productManager.add(3, "Gạo3", "Việt Nam", 50000);

        int option;
        int id, price;
        String name, nsx;
        do {
            menu();
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("-----ADD-----");
                    System.out.print("Enter product ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter NSX: ");
                    nsx = scanner.nextLine();
                    System.out.print("Enter price: ");
                    price = Integer.parseInt(scanner.nextLine());
                    productManager.add(id, name, nsx, price);
                    productManager.show();
                    break;
                case 2:
                    System.out.println("-----SHOW-----");
                    productManager.show();
                    break;
                case 3:
                    System.out.println("-----SEARCH-----");
                    System.out.println("Enter id: ");
                    id = Integer.parseInt(scanner.nextLine());
                    if (!productManager.search(id)) {
                        System.out.println("Not find");
                    }
                    break;
                case 4:
                    break;
            }
        }
        while (option != 4);
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Add");
        System.out.println("2. Show");
        System.out.println("3. Search");
        System.out.println("4. Exit");
        System.out.println("Enter your option");
        System.out.println("=>");
    }
}
