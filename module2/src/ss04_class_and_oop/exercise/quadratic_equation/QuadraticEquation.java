package ss04_class_and_oop.exercise.quadratic_equation;


public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA(){
        return this.a;
    }

    private double getB(){
        return this.b;
    }

    private double getC(){
        return this.c;
    }

    public double getDelta(){
        return (getB() * getB()) - (4 * (getA() * getC()));
    }

    public double getRoot1() {
        return  (-getB() + (Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC()))) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - (Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC()))) / (2 * getA());
    }

}
