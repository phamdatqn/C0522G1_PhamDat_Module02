package ss05_access_modifier_static_method_static_property.practice.student;

public class Student {
    private final int serials;
    private final String names;
    private static String college = "BBDIT";

    Student(int s, String n){
        serials = s;
        names=n;
    }

    static void change(){
        college = "CODYGYM";
    }

    void display(){
        System.out.println(serials+ " "+ names +" "+college);
    }

}
