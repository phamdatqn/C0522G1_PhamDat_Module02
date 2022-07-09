package ss06_inheritance_polymorphism.exercise.point2d_point3d.model;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return this.getXY();
    }

    public String toString() {
        return "X: " + getX() + ", Y: " + getY();
    }
}
