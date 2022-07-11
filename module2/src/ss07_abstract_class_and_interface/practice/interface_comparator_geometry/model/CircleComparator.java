package ss07_abstract_class_and_interface.practice.interface_comparator_geometry.model;

import ss07_abstract_class_and_interface.practice.interface_comparable_geometry.model.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
