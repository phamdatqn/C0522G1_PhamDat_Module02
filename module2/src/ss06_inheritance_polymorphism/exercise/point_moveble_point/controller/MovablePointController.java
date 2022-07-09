package ss06_inheritance_polymorphism.exercise.point_moveble_point.controller;

import ss06_inheritance_polymorphism.exercise.point_moveble_point.model.MovablePoint;

public class MovablePointController {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(2,3,4,6);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }
}
