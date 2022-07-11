package ss07_abstract_class_and_interface.exercise.interface_resizeable.model;

import ss07_abstract_class_and_interface.exercise.interface_colorable.model.Colorable;

public class Square extends Shape implements Resizeable {
    private double side;
    public Square() {
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public Square(double side) {
        this.side=side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side=side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side=side;
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+getSide()*percent/100);
    }
}
