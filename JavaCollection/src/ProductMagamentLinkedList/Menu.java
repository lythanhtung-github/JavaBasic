package ProductMagamentLinkedList;

public class Menu {

    public static void showMenu() {
        System.out.println("░░░░░░░░░░░░░░░░░ MENU ░░░░░░░░░░░░░░░░░");
        System.out.println("░           1. Thêm SP.                ░");
        System.out.println("░           2. Sửa SP.                 ░");
        System.out.println("░           3. Xóa SP.                 ░");
        System.out.println("░           4. Hiển thị DS.            ░");
        System.out.println("░           5. Tìm kiếm.               ░");
        System.out.println("░           6. Sắp xếp tăng dần.       ░");
        System.out.println("░           7. Sắp xếp giảm dần.       ░");
        System.out.println("░           8. Thoát.                  ░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Enter your choice: ");
        System.out.print("=> ");
    }

    public static void showHeadTable(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░ DANH SÁCH SẢM PHẨM ░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.print("-----------------------------------------------------------------------------\n");
        System.out.printf("|%-10s%-10s | %-10s%-16s | %-10s%-13s|\n"," ", "ID"," ", "Tên SP"," ", "Giá");
        System.out.print("-----------------------------------------------------------------------------\n");
    }
}
