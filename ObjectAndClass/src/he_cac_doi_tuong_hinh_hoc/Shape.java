package he_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean Filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public String toString() {
        return "A shape have color " + this.getColor() + " and filled is " + (this.isFilled() ? "on" : "off");
    }
}
