package ss07_abstract_class_and_interface.practice.interface_comparable_geometry.controller;

import ss07_abstract_class_and_interface.practice.interface_comparable_geometry.model.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleController {
    public static void main(String[] args) {

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Chưa sắp xếp:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("Sau sắp xếp:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
