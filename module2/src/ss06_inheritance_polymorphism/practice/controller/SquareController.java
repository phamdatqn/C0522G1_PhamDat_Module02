package ss06_inheritance_polymorphism.practice.controller;

import ss06_inheritance_polymorphism.practice.model.Square;

public class SquareController {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
