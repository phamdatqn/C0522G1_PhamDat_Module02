package ss06_inheritance_polymorphism.practice.controller;

import ss06_inheritance_polymorphism.practice.model.Circle;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
