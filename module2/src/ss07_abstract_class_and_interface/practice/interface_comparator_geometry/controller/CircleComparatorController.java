package ss07_abstract_class_and_interface.practice.interface_comparator_geometry.controller;

import ss07_abstract_class_and_interface.practice.interface_comparable_geometry.model.Circle;
import ss07_abstract_class_and_interface.practice.interface_comparator_geometry.model.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorController {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
