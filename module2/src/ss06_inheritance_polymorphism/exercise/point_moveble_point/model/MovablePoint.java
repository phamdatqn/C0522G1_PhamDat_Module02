package ss06_inheritance_polymorphism.exercise.point_moveble_point.model;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = new float[3];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public String toString() {
        return super.toString() + ", Speed= (" + getXSpeed() +", "+ getYSpeed() + ")";
    }

    public MovablePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }
}
