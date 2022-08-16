package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red",true, 4.0);
        shapes[1] = new Rectangle("yelow",false,7.0,8.0);
        shapes[2] = new Square("blue", true, 10.0);
        Shape.printShape(shapes);

    }

    }

