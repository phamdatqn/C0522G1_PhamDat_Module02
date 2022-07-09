package ss06_inheritance_polymorphism.exercise.triangle.model;

import ss06_inheritance_polymorphism.practice.model.Shape;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle(){}

    public Triangle(float side1,float side2, float side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public Triangle(float side1,float side2, float side3,String color,boolean filled){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getArea(){
        double p=getPerimeter()/2;
        return Math.pow((p)*(p-side1)*(p-side2)*(p-side3),0.5);
    }

    public String toString(){
        return "Tam giác có 3 cạnh là "+getSide1()+", "+getSide2()+", "+getSide3();
    }
}
