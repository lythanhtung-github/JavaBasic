package xay_dung_lop_chi_ghi;

public class Student {
    private String name = "John";
    private String classes = "C02";

    protected Student(){

    }

    void setName(String name){
        this.name = name;
    }

    void setClasses(String classes){
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Tung");
        student1.setClasses("C0622G1");
    }
}
