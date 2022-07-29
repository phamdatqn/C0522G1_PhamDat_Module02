package exercise_haitutor.mvclist_version2.service.impl;

import exercise_haitutor.mvclist_version2.exception.DuplicateIDException;
import exercise_haitutor.mvclist_version2.exception.InputNameException;
import exercise_haitutor.mvclist_version2.model.Student;
import exercise_haitutor.mvclist_version2.service.IStudentService;
import exercise_haitutor.mvclist_version2.util.IOFileUtil;
import exercise_haitutor.mvclist_version2.util.InputDayUtil;
import exercise_haitutor.mvclist_version2.util.InputNameUtil;
import exercise_haitutor.mvclist_version2.util.InputUtil;

import java.io.IOException;
import java.util.*;

public class StudentService implements IStudentService {
    public static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static Student infoStudent(int id) {
        double point;
        String name;
        while (true) {
            try {
                name=InputUtil.getString("Nhập tên học sinh mới: ");
                name = InputNameUtil.getNameUtil(name);
                break;
            } catch (InputNameException e) {
                System.err.println(e.getMessage());
            }

        }

        String dateOfBirth = InputDayUtil.getBirthDay("Nhập ngày sinh: ");

        System.out.print("Nhập giới tính: ");
        String sex = sc.nextLine();
        while (true) {
            try {
                System.out.print("Nhập điểm: ");
                point = Double.parseDouble(sc.nextLine());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Không được nhập ký tự chữ, phải nhập số!.");
            }
        }

        System.out.print("Nhập vào lớp: ");
        String grade = sc.nextLine();

        return new Student(id, name, dateOfBirth, sex, point, grade);

    }


    @Override
    public void add() throws IOException, DuplicateIDException {
        Student student;
        int id;
        studentList = IOFileUtil.readStudentFile(IOFileUtil.PATH_STUDENT);

        while (true) {
            try {
                id = InputUtil.getInt("Nhập id: ");
                for (Student item : studentList) {
                    if (item.getId() == id) {
                        throw new DuplicateIDException("Mã nhân viên đã tồn tại!");
                    }
                }
                student = infoStudent(id);
                studentList.add(student);
                IOFileUtil.writeStudentFile(IOFileUtil.PATH_STUDENT, studentList);
                System.out.println("Thêm mới thành công!\n");
                break;
            } catch (DuplicateIDException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    @Override
    public void displayAllStudent() {
        System.out.println("Danh sách sinh viên hiện có: ");
        List<Student> studentList = IOFileUtil.readStudentFile(IOFileUtil.PATH_STUDENT);
        for (Student item : studentList) {
            System.out.println(item);
        }
    }

    @Override
    public void remove() {
        studentList = IOFileUtil.readStudentFile(IOFileUtil.PATH_STUDENT);
        System.out.println("Mời bạn nhập id cần xóa:");
        int idRemove = Integer.parseInt(sc.nextLine());
        boolean answer = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == idRemove) {
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(i);
                    IOFileUtil.writeStudentFile(IOFileUtil.PATH_STUDENT, studentList);
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

    @Override
    public void findID() {
        studentList = IOFileUtil.readStudentFile(IOFileUtil.PATH_STUDENT);
        System.out.println("Mời bạn nhập id cần tìm:");
        int idFind = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < studentList.size(); i++) {
            if (idFind == studentList.get(i).getId()) {
                System.out.println("tìm thấy thông tin: " + idFind);
                System.out.println(studentList.get(i));
                return;

            }
        }

        System.out.println("Không tìm thấy thông tin: " + idFind);
    }


    @Override
    public void findName() {
        studentList = IOFileUtil.readStudentFile(IOFileUtil.PATH_STUDENT);
        System.out.println("Mời bạn nhập tên cần tìm:");
        String findName = sc.nextLine();
        List<Student> students = new ArrayList<>();

        findName = findName.toLowerCase(Locale.ROOT);
        boolean isFlag = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().toLowerCase(Locale.ROOT).contains(findName)) {
                students.add(studentList.get(i));
                isFlag = true;
            }
        }
        if (isFlag) {
            System.out.println("Danh sách liên quan đến tên : " + findName);
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }

        if (!isFlag) {
            System.out.println("Không tìm thấy thông tin liên quan đến tên : " + findName);
        }

    }

    @Override
    public void bubbleSortName() {
        studentList = IOFileUtil.readStudentFile(IOFileUtil.PATH_STUDENT);
        boolean needNextPass = true;
        for (int i = 1; i < studentList.size() && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < studentList.size() - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
        IOFileUtil.writeStudentFile(IOFileUtil.PATH_STUDENT, studentList);
        System.out.println("Danh sách sau sắp xếp: ");
        displayAllStudent();
    }

}
