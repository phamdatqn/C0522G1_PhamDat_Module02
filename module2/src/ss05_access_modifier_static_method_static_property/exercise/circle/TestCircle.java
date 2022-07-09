package ss05_access_modifier_static_method_static_property.exercise.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();

        System.out.println(circle.getRadius());

        System.out.println(circle.getColor());

        Circle circle1=new Circle(5,"Blue");

        System.out.println(circle1.getRadius());

        System.out.println(circle1.getColor());


    }
}
