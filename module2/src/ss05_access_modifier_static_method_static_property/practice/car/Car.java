package ss05_access_modifier_static_method_static_property.practice.car;

public class Car {
    private String name;

    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }
    void display(){
        System.out.printf("\nTên xe: %s\nĐộng cơ: %s ",name,engine);
    }
}
