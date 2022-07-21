package exercise_haitutor.mvclist.service.impl;

import exercise_haitutor.mvclist.exception.DuplicateIDException;
import exercise_haitutor.mvclist.model.Teacher;
import exercise_haitutor.mvclist.service.ITeacherService;

import java.util.*;

public class TeacherService implements ITeacherService {
    static Scanner sc = new Scanner(System.in);
    public static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "Nguyễn Ngọc Nam", "1993", "Nam", "Toán"));
        teacherList.add(new Teacher(2, "Bùi Bá Joan", "1992", "Nữ", "Lý"));
        teacherList.add(new Teacher(3, "Vững Trưng", "1991", "Nam", "Hóa"));
        teacherList.add(new Teacher(4, "Vũ Trượng", "1999", "Nữ", "Sinh"));
        teacherList.add(new Teacher(5, "Công Thành", "1996", "Nam", "Văn"));
        teacherList.add(new Teacher(6, "Trần Anh Nam", "1999", "Nam", "Hóa"));
        teacherList.add(new Teacher(7, "Công Thành Nam", "1997", "Nam", "Văn"));
    }

    public static Teacher infoTeacher() {
        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai, không được nhập ký tự chữ !");
            }
        }


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
    public void addTeacher() throws DuplicateIDException {
        Teacher teacher = infoTeacher();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacher.getId() == teacherList.get(i).getId()) {
                throw new DuplicateIDException("Id đã tồn tại");
            }
        }
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

    public void findID() {
        System.out.println("Mời bạn nhập id cần tìm:");
        int idFind = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < teacherList.size(); i++) {
            if (idFind == teacherList.get(i).getId()) {
                System.out.println("tìm thấy thông tin: " + idFind);
                System.out.println(teacherList.get(i).toString());
                return;
            }
        }

        System.out.println("Không tìm thấy thông tin: " + idFind);
    }


    @Override
    public void findName() {
        System.out.println("Mời bạn nhập tên cần tìm:");
        String findName = sc.nextLine();
        ArrayList<Teacher> students = new ArrayList<>();

        findName = findName.toLowerCase(Locale.ROOT);
        boolean isFlag = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().toLowerCase(Locale.ROOT).contains(findName)) {
                students.add(teacherList.get(i));
                isFlag = true;
            }
        }
        if (isFlag) {
            System.out.println("Danh sách liên quan đến tên : " + findName);
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).toString());
            }
        }

        if (!isFlag) {
            System.out.println("Không tìm thấy thông tin liên quan đến tên : " + findName);
        }

    }

    @Override
    public void bubbleSortName() {
        boolean needNextPass = true;
        for (int i = 1; i < teacherList.size() && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < teacherList.size() - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sau sắp xếp: ");
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).toString());
        }
    }
}



