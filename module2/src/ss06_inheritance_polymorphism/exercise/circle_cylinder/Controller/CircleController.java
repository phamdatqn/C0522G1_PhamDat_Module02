package ss06_inheritance_polymorphism.exercise.circle_cylinder.Controller;

import ss06_inheritance_polymorphism.exercise.circle_cylinder.Model.Circle;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(2, "blue");
        System.out.println(circle1);

    }
}
