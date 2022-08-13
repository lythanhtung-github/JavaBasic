package fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        String str = "";
        if (this.on == true) {
            str = "Fan have speed is "
                    + this.speed + ", color is "
                    + this.color + ", radius is "
                    + this.radius + " and fan is on";
        } else {
            str = "Fan have color is " + this.color + ", radius is " + this.radius + "and fan is off";
        }
        return str;
    }
}
