package ss05_access_modifier_static_method_static_property.exercise.student;

public class Student {
    private String name="John";

    private String classes="C02";

    public Student(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
    public String toString(){
        return String.format("name: %s, class: %s", name,classes);
    }
}
