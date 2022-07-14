package ss10_dsa_list.exercise.arraymylist.controller;

import ss10_dsa_list.exercise.arraymylist.model.Student;
import ss10_dsa_list.exercise.arraymylist.service.impl.MyArrayListService;

import java.util.Scanner;

public class StudentListController {
    Scanner sc=new Scanner(System.in);
    static MyArrayListService<Student> myArrayListService=new MyArrayListService<>();
    static {
        myArrayListService.add(new Student(1,"Đạt Phạm"));
        myArrayListService.add(new Student(2,"Văn Hoàng"));
        myArrayListService.add(new Student(3,"Tiến Thu"));
        myArrayListService.add(new Student(4,"Thành Luân"));
        myArrayListService.add(new Student(5,"Phát Tài"));
    }

    public void display(){
        for (int i =0;i< myArrayListService.size();i++){
            System.out.println(myArrayListService.elements[i]);
        }
    }

    public Student createStudent() {
        System.out.println("Nhập vào ID");
        int iD = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào tên");
        String name = sc.nextLine();
        return new Student(iD,name);
    }

    public void addStudent() {
        myArrayListService.add(createStudent());
        System.out.print("Thêm mới thành công" +createStudent());
    }

    public void addStudent(int index) {
        System.out.println("Nhập index: ");
        index =Integer.parseInt(sc.nextLine());
        myArrayListService.add(index,createStudent());
    }

    public  void deleteStudent(int index){
        System.out.println("Nhập index: ");
        index =Integer.parseInt(sc.nextLine());
        myArrayListService.remove(index);
    }
}
