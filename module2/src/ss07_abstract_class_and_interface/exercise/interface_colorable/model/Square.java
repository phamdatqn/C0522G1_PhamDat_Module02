package ss07_abstract_class_and_interface.exercise.interface_colorable.model;

public class Square extends Shape implements Colorable {
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

    public void howToCoLor(){
        System.out.println("Color all four sides..");
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
