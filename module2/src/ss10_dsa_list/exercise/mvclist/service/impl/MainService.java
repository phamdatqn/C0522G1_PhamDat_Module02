package ss10_dsa_list.exercise.mvclist.service.impl;

import ss10_dsa_list.exercise.mvclist.service.IMainService;

import java.util.Scanner;

public class MainService implements IMainService {
    public void displayList() {
        StudentService studentService =new StudentService();
        TeacherService teacherService = new TeacherService();
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn chọn: \n1. DS Giảng viên\n2. DS Học Viên");
        int choose= Integer.parseInt(sc.nextLine());
        if (choose==1){
            System.out.println("Danh sách tất cả giáo viên hiện có:");
            teacherService.displayAllTeacher();
        }
        if (choose==2){
            System.out.println("Danh sách tất cả học sinh hiện có:");
            studentService.displayAllStudent();
        }
    }
}
