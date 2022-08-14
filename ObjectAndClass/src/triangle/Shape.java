package triangle;

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
        return "Hình có màu " + this.getColor() + " và " + (this.isFilled() ? "có đổ màu" : "không đổ màu");
    }
}


