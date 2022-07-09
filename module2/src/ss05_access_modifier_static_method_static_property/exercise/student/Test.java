package ss05_access_modifier_static_method_static_property.exercise.student;

import ss05_access_modifier_static_method_static_property.exercise.student.Student;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();

        System.out.println(student);

        student.setName("ABC");

        student.setClasses("C05");

        System.out.println(student);

    }
}
