package exercise_haitutor.mvclist.service.impl;

import exercise_haitutor.mvclist.model.Person;
import exercise_haitutor.mvclist.service.IMainService;

import java.util.ArrayList;
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
            }
        }
    }

    @Override
    public void findName() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        System.out.println("Nhập nhập tên cần tìm: ");
        String nameFind = sc.nextLine();

        boolean Flag = false;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().contains(nameFind)) {
                personArrayList.add(people.get(i));
                Flag = true;
            }
        }
        if (Flag) {
            System.out.println("Tìm thấy thông tin liên quan đến tên: " + nameFind);
            for (int j = 0; j < personArrayList.size(); j++) {
                System.out.println(personArrayList.get(j).toString());
            }
        }
        if (!Flag) {
            System.out.println("Không tìm thấy thông tin liên quan tên: " + nameFind);
        }
    }

}


