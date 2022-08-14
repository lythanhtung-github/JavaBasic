package he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter(){
        return (this.width+this.length)*2;
    }

    @Override
    public String toString(){
        return "A Rectangle with width = "
                + getWidth()
                + ", length = "
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
