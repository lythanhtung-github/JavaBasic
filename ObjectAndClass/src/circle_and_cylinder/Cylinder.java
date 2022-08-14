package circle_and_cylinder;

public class Cylinder extends Circle{
    private double height = 7.0;
    public Cylinder(){

    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height){
         this.height = height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString(){
        return "Cylinder have height = "
                + this.getHeight()
                + " "
                + super.toString();
    }
}
