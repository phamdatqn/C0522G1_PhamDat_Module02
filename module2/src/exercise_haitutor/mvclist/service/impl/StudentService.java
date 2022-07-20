package exercise_haitutor.mvclist.service.impl;

import exercise_haitutor.mvclist.model.Student;
import exercise_haitutor.mvclist.service.IStudentService;

import java.util.*;

public class StudentService implements IStudentService {
    public static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static {
        studentList.add(new Student(1, "Phạm Đạt", "2000", 8, "C0522G1"));
        studentList.add(new Student(2, "Tiến Thanh", "1993", 4, "C0622G1"));
        studentList.add(new Student(3, "Phong Trần", "1994", 2, "C0722G1)"));
        studentList.add(new Student(4, "Hạ Vũ", "1997", 9, "C0822G1"));
        studentList.add(new Student(5, "Văn Thần", "1991", 6, "C0922G1"));
        studentList.add(new Student(6, "Phạm Thành Đạt", "2000", 8, "C0522G1"));
        studentList.add(new Student(7, "Nguyễn Tiến Đạt", "2000", 8, "C0522G1"));
    }

    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập name: ");
        String name = sc.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();

        System.out.print("Nhập điểm: ");
        double point = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập vào lớp: ");
        String grade = sc.nextLine();

        return new Student(id, name, dateOfBirth, point, grade);
    }

    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!\n");
    }

    @Override
    public void displayAllStudent() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public void removeStudent() {
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
        System.out.println("Mời bạn nhập id cần tìm:");
        int idFind = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < studentList.size(); i++) {
            if (idFind == studentList.get(i).getId()) {
                System.out.println("tìm thấy thông tin: " + idFind);
                System.out.println(studentList.get(i).toString());
                return;

            }
        }

        System.out.println("Không tìm thấy thông tin: " + idFind);
    }


    @Override
    public void findName() {
        System.out.println("Mời bạn nhập tên cần tìm:");
        String findName = sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();

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
        for (int i=1;i<studentList.size() && needNextPass;i++){

            needNextPass=false;
            for (int j=0;j<studentList.size()-i;j++){
                if (studentList.get(j).getName().compareTo(studentList.get(j+1).getName())>0){
                    Collections.swap(studentList,j,j+1);
                    needNextPass=true;
                }
            }
        }
        System.out.println("Danh sách sau sắp xếp: ");
        for (int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i).toString());
        }
    }

}
