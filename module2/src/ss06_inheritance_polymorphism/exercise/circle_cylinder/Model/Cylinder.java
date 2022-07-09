package ss06_inheritance_polymorphism.exercise.circle_cylinder.Model;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return super.toString() + " Chiều cao: " + getHeight() + " Thể tích là: " + getVolume();
    }


}
