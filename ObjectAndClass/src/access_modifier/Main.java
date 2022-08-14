package access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1: "+ circle1.getRadius()+ " and " + circle1.getColor());
        Circle circle2 = new Circle(2.0);
        System.out.println("Circle 2: "+ circle2.getRadius()+ " and " + circle2.getColor());
    }
}
