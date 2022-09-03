package ProductMagamentLinkedList;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.add("IP12", 12000000);
        productManager.add("IP13", 13000000);
        productManager.add("IP11", 11000000);
        productManager.add("IP10", 10000000);
        productManager.add("IP8", 2000000);

        int option = -1;
        do {
            Menu.showMenu();
            option = Integer.parseInt(scanner.nextLine());
            String name;
            int id, price;
            switch (option) {
                case 1:
                    System.out.println("░░░░░░░░░░░░░░░░░ THÊM SP ░░░░░░░░░░░░░░░░░");
                    System.out.print("Nhập tên: ");
                    name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    price = Integer.parseInt(scanner.nextLine());
                    productManager.add(name, price);
                    System.out.println("Thêm thành công");
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("░░░░░░░░░░░░░░░░░ SỬA SP ░░░░░░░░░░░░░░░░░");
                    System.out.print("Nhập ID cần sửa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên mới: ");
                    name = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    price = Integer.parseInt(scanner.nextLine());
                    productManager.update(id, name, price);
                    System.out.println("Sửa thành công");
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("░░░░░░░░░░░░░░░░░ XÓA SP ░░░░░░░░░░░░░░░░░");
                    System.out.print("Nhập ID cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    productManager.delete(id);
                    System.out.println("Xóa thành công");
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 4:
                    Menu.showHeadTable();
                    productManager.render();
                    System.out.print("-----------------------------------------------------------------------------\n");
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("░░░░░░░░░░░░░░░░ TÌM KIẾM ░░░░░░░░░░░░░░░░");
                    System.out.print("Nhập tên cần tìm: ");
                    name = scanner.nextLine();
                    productManager.find(name);
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("=> SẮP XẾP TĂNG DẦN ");
                    Menu.showHeadTable();
                    productManager.ascendingSort();
                    System.out.print("-----------------------------------------------------------------------------\n");
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("=> SẮP XẾP GIẢM DẦN ");
                    Menu.showHeadTable();
                    productManager.descendingSort();
                    System.out.print("-----------------------------------------------------------------------------\n");
                    System.out.print("Enter để tiếp tục");
                    scanner.nextLine();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại!");
                    break;
            }
        } while (option != 8);
    }
}
