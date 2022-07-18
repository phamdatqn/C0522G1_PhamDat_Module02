package ss12_map.practice.hashmap_hashset.controller;

import ss12_map.practice.hashmap_hashset.model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Dat", 13, "Hà Nội");
        Student student2 = new Student("Huệ", 15, "Đà Nẵng");
        Student student3 = new Student("Tiến", 17, "Quảng Nam");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry.toString());
        }

        System.out.println("\n======== Set ========");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
