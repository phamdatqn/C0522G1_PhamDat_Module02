package ss07_abstract_class_and_interface.exercise.interface_resizeable.controller;

import ss07_abstract_class_and_interface.exercise.interface_resizeable.model.Circle;
import ss07_abstract_class_and_interface.exercise.interface_resizeable.model.Rectangle;
import ss07_abstract_class_and_interface.exercise.interface_resizeable.model.Shape;
import ss07_abstract_class_and_interface.exercise.interface_resizeable.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(4);
        shape[1] = new Rectangle(5, 6);
        shape[2] = new Square(7);


        for (Shape shape1 : shape) {
            System.out.println("Chưa tăng:");
            System.out.println(shape1.getArea());

            if (shape1 instanceof Circle) {
                ((Circle) shape1).resize(Math.random()*100);
                System.out.println("Hình tròn sau khi tăng :");
            }

            if (shape1 instanceof Rectangle) {
                ((Rectangle) shape1).resize(Math.random()*100);
                System.out.println("Hình chữ nhật sau khi tăng :");
            }

            if (shape1 instanceof Square) {
                ((Square) shape1).resize(Math.random() * 100);
                System.out.println("Hình vuông sau khi tăng:");
            }

            System.out.println(shape1.getArea() + "\n");

        }

    }
}
