package ss05_access_modifier_static_method_static_property.exercise.circle;

public class Circle {
    private double radius=1.0;

    private String color="red";

    public Circle(){};

    public Circle(double r,String color){
        this.radius=r;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor(){
        return color;
    }

    private double getArea(){
        return radius*radius*Math.PI;
    }
//    public String display(){
//     return String.format("\nkhi bán kính %.2f\nThì diện tích là: %.2f\nmau: %s",getRadius(),getArea(),getColor());
//    }
}
