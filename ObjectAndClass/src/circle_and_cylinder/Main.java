package circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(8.0, 6.0, "red" );
        System.out.println(cylinder);
    }
}
