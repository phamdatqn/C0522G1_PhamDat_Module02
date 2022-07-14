package ss10_dsa_list.mvclist.service.impl;

import ss10_dsa_list.mvclist.model.Student;
import ss10_dsa_list.mvclist.service.IStudentService;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static {
        studentList.add(new Student(1,"Phạm Đạt","2000",8,"C0522G1"));
        studentList.add(new Student(2,"Tiến Thanh","1993",4,"C0622G1"));
        studentList.add(new Student(3,"Phong Trần","1994",2,"C0722G1)"));
        studentList.add(new Student(4,"Hạ Vũ","1997",9,"C0822G1"));
        studentList.add(new Student(5,"Văn Thần","1991",6,"C0922G1"));
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

        Student student = new Student(id, name, dateOfBirth, point,grade);
        return student;
    }

    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!\n");
    }

    @Override
    public void displayAllStudent() {
        for (int i =0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa:");
        int idRemove=Integer.parseInt(sc.nextLine());
        boolean answer =false;
        for (int i=0;i<studentList.size();i++){
            if (studentList.get(i).getId()==idRemove){
                System.out.println("Bạn chắc chắn muốn xóa?\n" +
                        "1. Có\n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(sc.nextLine());
                if (chooseYesNo==1){
                    studentList.remove(i);
                    System.out.println("đã xóa id "+idRemove+" thành công!");
                }
                answer=true;
                break;
            }
        }
        if (!answer){
            System.out.println("Không tìm thấy id: "+idRemove);
        }
    }

}
