package ss05_access_modifier_static_method_static_property.practice.student;

import ss05_access_modifier_static_method_static_property.practice.student.Student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1=new Student(1, "Hoàng Kim");
        Student s2=new Student(2, "Hoàng Dung");
        Student s3=new Student(3, "Kim Liên");

        s1.display();
        s2.display();
        s3.display();
    }
}
