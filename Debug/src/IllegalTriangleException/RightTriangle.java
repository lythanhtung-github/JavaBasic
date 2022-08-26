package IllegalTriangleException;

public class RightTriangle {
    public void checkRightTriangle(double a, double b, double c) throws IllegalRightTriangleException {
//        if (a < 0 || b < 0 || c < 0) {
//            throw new IllegalRightTriangleException("Loi: Canh tam giac khong hop le");
//        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalRightTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
