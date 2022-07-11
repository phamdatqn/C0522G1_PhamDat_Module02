package ss07_abstract_class_and_interface.exercise.interface_colorable.controller;

import ss07_abstract_class_and_interface.exercise.interface_colorable.model.*;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Square(4,"blue",true);
        shapes[1]=new Square(7,"red",false);
        shapes[2]=new Rectangle(7,5);
        shapes[3]=new Circle(7,"red",false);


        for (Shape shape: shapes){
            if (shape instanceof Colorable){
                ((Colorable) shape).howToCoLor();
                System.out.println(shape);
                System.out.println("Diện tích là: "+shape.getArea()+"\n");
            }

        }
    }
}
