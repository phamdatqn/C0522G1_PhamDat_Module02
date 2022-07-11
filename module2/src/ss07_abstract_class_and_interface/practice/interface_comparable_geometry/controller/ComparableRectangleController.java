package ss07_abstract_class_and_interface.practice.interface_comparable_geometry.controller;

import ss07_abstract_class_and_interface.practice.interface_comparable_geometry.model.ComparableRectangle;

import java.util.Arrays;

public class ComparableRectangleController {
    public static void main(String[] args) {

        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle(3, 4);
        rectangles[1] = new ComparableRectangle(1, 2);
        rectangles[2] = new ComparableRectangle(5, 6);

        System.out.println("Chưa sắp xếp:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }

        Arrays.sort(rectangles);

        System.out.println("Sau sắp xếp tăng dần theo diện tích:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }
    }
}
