package exercise_haitutor.mvclist.service.impl;

import exercise_haitutor.mvclist.model.Person;
import exercise_haitutor.mvclist.service.IMainService;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainService implements IMainService {
    static ArrayList<Person> people = new ArrayList<>();
    StudentService studentService = new StudentService();
    TeacherService teacherService = new TeacherService();

    static {
        people.addAll(StudentService.studentList);
        people.addAll(TeacherService.teacherList);

    }

    Scanner sc = new Scanner(System.in);

    public void displayList() {

        System.out.println("Mời bạn chọn: \n1. DS Giảng viên\n2. DS Học Viên\n3. Cả 2 Danh Sách");
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 1) {
            System.out.println("Danh sách tất cả giáo viên hiện có:");
            teacherService.displayAllTeacher();
        }
        if (choose == 2) {
            System.out.println("Danh sách tất cả học sinh hiện có:");
            studentService.displayAllStudent();
        }
        if (choose == 3) {
            System.out.println("Danh sách Giảng Viên:");
            teacherService.displayAllTeacher();
            System.out.println("\nDanh sách Học Viên:");
            studentService.displayAllStudent();
        }
    }

    @Override
    public void findID() {
        System.out.println("Nhập ID cần tìm: ");
        int idFind = sc.nextInt();

        for (int i = 0; i < people.size(); i++) {
            if (idFind == people.get(i).getId()) {
                System.out.println("Tìm thấy thông tin ID:" + idFind);
                System.out.println(people.get(i).toString());
                return;
            }
        }
        System.out.println("Không tìm thấy thông tin ID: " + idFind);
    }

    @Override
    public void findName() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        System.out.println("Nhập nhập tên cần tìm: ");
        String findName = sc.nextLine();

        findName = findName.toLowerCase(Locale.ROOT);
        boolean Flag = false;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().toLowerCase(Locale.ROOT).contains(findName)) {
                personArrayList.add(people.get(i));
                Flag = true;
            }
        }
        if (Flag) {
            System.out.println("Tìm thấy thông tin liên quan đến tên: " + findName);
            for (int j = 0; j < personArrayList.size(); j++) {
                System.out.println(personArrayList.get(j).toString());
            }
        }
        if (!Flag) {
            System.out.println("Không tìm thấy thông tin liên quan tên: " + findName);
        }
    }

    @Override
    public void insertSortName() {
        for (int i = 1; i < people.size(); i++) {
            Person key = people.get(i);
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (people.get(j).getName().compareTo(key.getName()) > 0) {
                    people.set(j + 1, people.get(j));
                } else {
                    break;
                }
            }
            people.set(j + 1, key);
        }
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}


