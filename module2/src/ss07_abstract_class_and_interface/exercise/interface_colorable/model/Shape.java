package ss07_abstract_class_and_interface.exercise.interface_colorable.model;

public abstract class Shape {
   private String color= "green";
   private boolean filled= true;

    public Shape() {
    }

    public abstract double getArea();

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString(){
     return "Lớp A có màu: "+getColor()+" full viền: "+isFilled();
    }


}