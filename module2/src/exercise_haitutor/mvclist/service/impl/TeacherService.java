package exercise_haitutor.mvclist.service.impl;

import exercise_haitutor.mvclist.model.Teacher;
import exercise_haitutor.mvclist.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "Nguyễn Ngọc Nam", "1993", "Nam", "Toán"));
        teacherList.add(new Teacher(2, "Bùi Bá Joan", "1992", "Nữ", "Lý"));
        teacherList.add(new Teacher(3, "Vững Trưng", "1991", "Nam", "Hóa"));
        teacherList.add(new Teacher(4, "Vũ Trượng", "1999", "Nữ", "Sinh"));
        teacherList.add(new Teacher(5, "Công Thành", "1996", "Nam", "Văn"));
    }

    public static Teacher infoTeacher() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập name: ");
        String name = sc.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();

        System.out.print("Nhập Giới tính: ");
        String sex = sc.nextLine();

        System.out.print("Nhập vào chuyên môn: ");
        String grade = sc.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, sex, grade);
        return teacher;
    }

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm giảng viên thành công!");
    }


    @Override
    public void displayAllTeacher() {
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i));
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Mời bạn nhập id cần xóa:");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean answer = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId() == idRemove) {
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(i);
                    System.out.println("đã xóa id " + idRemove + " thành công!");
                }
                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println("Không tìm thấy id: " + idRemove);
        }
    }
}


