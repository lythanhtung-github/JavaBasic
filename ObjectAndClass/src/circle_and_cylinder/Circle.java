package circle_and_cylinder;

public class Circle {
    private double radius = 5.0;
    private String color = "blue";

    public Circle() {

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public String toString(){
        return "Circle have radius = "
                + this.getRadius()
                + ", color is "
                + this.getColor()
                + ", area is "
                + this.getArea();
    }
}
