package resizeable;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("red",true, 4.0);
        shapes[1] = new Rectangle("yelow",false,7.0,8.0);
        shapes[2] = new Square("blue", true, 10.0);
        System.out.println("Shape before: ");
        Shape.printShape(shapes);

        for (Shape shape : shapes){
            shape.resize((Math.random()*100)/100);
        }

        System.out.println("Shape after resize: ");
        Shape.printShape(shapes);
    }
}
