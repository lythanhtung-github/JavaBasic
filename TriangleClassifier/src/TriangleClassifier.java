import java.util.Scanner;

public class TriangleClassifier {
    public static boolean checkTriangle(int edge1, int edge2, int edge3) {
        boolean isTriangle;
        isTriangle = edge1 > 0
                && edge2 > 0
                && edge3 > 0
                && (edge1 + edge2) > edge3
                && (edge1 + edge3) > edge2
                && (edge2 + edge3) > edge1;
        return isTriangle;
    }

    public static boolean checkRightTriangle(int edge1, int edge2, int edge3) {
        boolean isRightTriangle;
        isRightTriangle = edge1 * edge1 + edge2 * edge2 == edge3 * edge3
                || edge1 * edge1 + edge3 * edge3 == edge2 * edge2
                || edge2 * edge2 + edge3 * edge3 == edge1 * edge1;
        return isRightTriangle;
    }

    public static boolean checkEquilateralTriangle(int edge1, int edge2, int edge3){
        boolean isEquilateralTriangle;
        isEquilateralTriangle = edge1 == edge2 && edge2 == edge3;
        return isEquilateralTriangle;
    }

    public static boolean checkIsoscelesTriangle(int edge1, int edge2, int edge3){
        boolean isIsoscelesTriangle;
        isIsoscelesTriangle = edge1 == edge2 || edge1 == edge3 || edge2 == edge3;
        return isIsoscelesTriangle;
    }

    public static String triangleClassifier(int edge1, int edge2, int edge3) {
        String triangleClassifier;
        if (checkTriangle(edge1, edge2, edge3)) {
            if (checkEquilateralTriangle(edge1, edge2, edge3)) {
                triangleClassifier = "Tam giác đều";
            } else if (checkIsoscelesTriangle(edge1, edge2, edge3)) {
                triangleClassifier = "Tam giác cân";
            } else if (checkRightTriangle(edge1, edge2, edge3)) {
                triangleClassifier = "Tam giác vuông";
            } else {
                triangleClassifier = "Tam giác thường";
            }
        } else {
            triangleClassifier = "Không phải là tam giác";
        }
        return triangleClassifier;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        int edge1 = sc.nextInt();

        System.out.println("Nhập độ dài cạnh thứ hai: ");
        int edge2 = sc.nextInt();

        System.out.println("Nhập độ dài cạnh thứ ba: ");
        int edge3 = sc.nextInt();

        String result = triangleClassifier(edge1, edge2, edge3);
        System.out.println("Kết quả: " + result);
    }
}
