package point_moveablePoint;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint() {
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.xSpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] xYSpeed = {this.xSpeed, this.ySpeed};
        return xYSpeed;
    }

    public String move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return "Point move to ("
                + super.getX()
                + ","
                + super.getY()
                + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " " + Arrays.toString(this.getSpeed());
    }
}
