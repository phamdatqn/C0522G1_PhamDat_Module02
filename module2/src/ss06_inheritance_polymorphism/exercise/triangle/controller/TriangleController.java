package ss06_inheritance_polymorphism.exercise.triangle.controller;

import ss06_inheritance_polymorphism.exercise.triangle.model.Triangle;

import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhập vào cạnh thứ nhất: ");
        float side1=sc.nextFloat();

        System.out.println("Nhập vào cạnh thứ hai: ");
        float side2=sc.nextFloat();

        System.out.println("Nhập vào cạnh thứ ba: ");
        float side3=sc.nextFloat();

        sc.nextLine();
        System.out.println("Nhập màu: ");
        String color=sc.nextLine();

        Triangle triangle=new Triangle(side1,side2,side3,color,false);
        System.out.println(triangle.toString()+"\nMàu là: "+triangle.getColor());
    }
}
