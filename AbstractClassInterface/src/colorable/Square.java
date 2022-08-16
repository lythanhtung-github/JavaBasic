package colorable;

public class Square extends Shape {
    private double side = 5.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString(){
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", "
                + this.howToColor();
    }

    @Override
    public String howToColor(){
        if (super.isFilled()){
            return("Color all four sides");
        }
        else return("No color");
    }

}
