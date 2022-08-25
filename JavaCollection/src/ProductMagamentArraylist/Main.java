package ProductMagamentArraylist;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Menu menu = new Menu();
        productManager.add("IP12", 12000000);
        productManager.add("IP13", 13000000);
        productManager.add("IP11", 11000000);
        productManager.add("IP10", 10000000);
        productManager.add("IP8", 2000000);

        int option = -1;
        do {
            menu.showMenu();
            System.out.println("Enter your choice: ");
            System.out.print("=> ");
            option = Integer.parseInt(scanner.nextLine());
            String name;
            int id, price;
            switch (option) {
                case 1:
                    System.out.println("Thêm tên: ");
                    name = scanner.nextLine();
                    System.out.println("Thêm giá: ");
                    price = Integer.parseInt(scanner.nextLine());
                    productManager.add(name, price);
                    System.out.println("Thêm thành công");
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Nhập ID cần sửa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên mới: ");
                    name = scanner.nextLine();
                    System.out.println("Nhập giá mới: ");
                    price = Integer.parseInt(scanner.nextLine());
                    productManager.update(id, name, price);
                    System.out.println("Sửa thành công");
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Nhập ID cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    productManager.delete(id);
                    System.out.println("Xóa thành công");
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 4:
                    productManager.render();
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Nhập tên cần tìm: ");
                    name = scanner.nextLine();
                    productManager.find(name);
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Sắp xếp tăng dần");
                    productManager.ascendingSort();
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần");
                    productManager.descendingSort();
                    System.out.println("Enter to next");
                    scanner.nextLine();
                    break;
                case 8:
                    break;
            }
        } while (option != 8);
    }
}
