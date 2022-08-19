package test2;

public class NhanVienFullTime extends NhanVien {

//    @Override
//    public void xuatThongTin() {
//        System.out.println("Nhân viên toàn thời gian: " + ten);
//    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        NhanVienFullTime nhanVienFullTime = new NhanVienFullTime();


        NhanVien nhanvien2 = new NhanVien();
        if (nhanvien2 instanceof NhanVienFullTime) {
            System.out.println("Là nhân viên fulltime");
        } else {
            System.out.println("Không phải nhân viên fulltime");
        }

        NhanVien nhanvien3 = new NhanVienFullTime();
        if (nhanvien3 instanceof NhanVienFullTime){
            System.out.println("Là nhân viên fulltime");
        } else {
            System.out.println("Không phải nhân viên fulltime");
        }

        nhanVien.setTen("Bình Gold");
        nhanVienFullTime.setTen("Lộc Shadow");


        nhanVien.xuatThongTin();
        nhanVienFullTime.xuatThongTin();
//
//        // Ép kiểu ngầm định
//        nhanVien = nhanVienFullTime;
//
//        nhanVien.xuatThongTin();
//        nhanVienFullTime.xuatThongTin();
//
//        nhanVien.setTen("Tài Smile");
//
//        //Ép kiểu Tường minh
//        nhanVienFullTime = (NhanVienFullTime) nhanVien;
//        nhanVienFullTime.xuatThongTin();
    }
}
