package exercise_haitutor.mvclist_version2.service.impl;

import exercise_haitutor.mvclist_version2.exception.DuplicateIDException;
import exercise_haitutor.mvclist_version2.model.Teacher;
import exercise_haitutor.mvclist_version2.service.ITeacherService;
import exercise_haitutor.mvclist_version2.util.IOFileUtil;

import java.io.IOException;
import java.util.*;

public class TeacherService implements ITeacherService {
    static Scanner sc = new Scanner(System.in);
    public static List<Teacher> teacherList = new ArrayList<>();

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

        return new Teacher(id, name, dateOfBirth, sex, grade);
    }

    @Override
    public void add() throws DuplicateIDException, IOException {
        Teacher teacher;
        teacherList = IOFileUtil.readTeacherFile(IOFileUtil.PATH_TEACHER);

        teacher = infoTeacher();
        for (Teacher item : teacherList) {
            if (item.getId() == teacher.getId()) {
                throw new DuplicateIDException("Id đã tồn tại!");
            }
        }
        teacherList.add(teacher);
        IOFileUtil.writeTeacherFile(IOFileUtil.PATH_TEACHER, teacherList);
        System.out.println("Thêm mới thành công!\n");

    }

    @Override
    public void displayAllTeacher() {
        System.out.println("Danh sách giao viên hiện có: ");
        List<Teacher> teacherList = IOFileUtil.readTeacherFile(IOFileUtil.PATH_TEACHER);
        for (Teacher item : teacherList) {
            System.out.println(item);
        }
    }

    @Override
    public void remove() throws IOException {
        teacherList = IOFileUtil.readTeacherFile(IOFileUtil.PATH_TEACHER);
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
                    IOFileUtil.writeTeacherFile(IOFileUtil.PATH_TEACHER, teacherList);
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
        teacherList = IOFileUtil.readTeacherFile(IOFileUtil.PATH_TEACHER);
        System.out.println("Mời bạn nhập id cần tìm:");
        int idFind = Integer.parseInt(sc.nextLine());

        for (Teacher teacher : teacherList) {
            if (idFind == teacher.getId()) {
                System.out.println("tìm thấy thông tin: " + idFind);
                System.out.println(teacher);
                return;
            }
        }

        System.out.println("Không tìm thấy thông tin: " + idFind);
    }


    @Override
    public void findName() {
        teacherList = IOFileUtil.readTeacherFile(IOFileUtil.PATH_TEACHER);
        System.out.println("Mời bạn nhập tên cần tìm:");
        String findName = sc.nextLine();
        ArrayList<Teacher> teachers = new ArrayList<>();

        findName = findName.toLowerCase(Locale.ROOT);
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getName().toLowerCase(Locale.ROOT).contains(findName)) {
                teachers.add(teacher);
                isFlag = true;
            }
        }
        if (isFlag) {
            System.out.println("Danh sách liên quan đến tên : " + findName);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }

        if (!isFlag) {
            System.out.println("Không tìm thấy thông tin liên quan đến tên : " + findName);
        }

    }

    @Override
    public void bubbleSortName() {
        teacherList = IOFileUtil.readTeacherFile(IOFileUtil.PATH_TEACHER);
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
        IOFileUtil.writeTeacherFile(IOFileUtil.PATH_TEACHER, teacherList);
        displayAllTeacher();
    }
}



