package ss07_abstract_class_and_interface.practice.interface_comparable_geometry.model;

import ss06_inheritance_polymorphism.practice.model.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double length) {
        super(width, length);
    }

    public ComparableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) return 1;

        if (getArea() < o.getArea()) return -1;

        else return 1;
    }
}
