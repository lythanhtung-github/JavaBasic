package test2;

public class NhanVien {

    protected String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void xuatThongTin() {
        System.out.println("Nhân viên: " + ten);
    }
}
