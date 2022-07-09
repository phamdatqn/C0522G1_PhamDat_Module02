package ss04_class_and_oop.exercise.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private boolean on = false;
    private int speed = SLOW;
    private double radius = 5;
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

    public boolean isOn() {
        return on;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is on }";
        }
        return "Fan{" +
                " radius=" + radius +
                ", color='" + color + '\'' +
                ", fan is off }";
    }

}

