package ss07_abstract_class_and_interface.exercise.interface_resizeable.controller;

import ss06_inheritance_polymorphism.practice.model.Shape;

public class ShapController {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
