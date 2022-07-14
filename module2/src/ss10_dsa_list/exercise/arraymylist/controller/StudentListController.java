package ss10_dsa_list.exercise.arraymylist.controller;

import ss10_dsa_list.exercise.arraymylist.model.Student;
import ss10_dsa_list.exercise.arraymylist.service.impl.MyArrayListService;

import java.util.Scanner;

public class StudentListController {
    Scanner sc=new Scanner(System.in);
    static MyArrayListService<Student> myArrayListService=new MyArrayListService<>();
    static {
        myArrayListService.add(new Student(1,"Đạt Phạm","Hà Nội"));
        myArrayListService.add(new Student(2,"Văn Hoàng","Đà Nẵng"));
        myArrayListService.add(new Student(3,"Tiến Thu","Quảng Nam"));
        myArrayListService.add(new Student(4,"Thành Luân","Quảng Ngãi"));
        myArrayListService.add(new Student(5,"Phát Tài","Đồng Nai"));
    }

    public void display(){
        System.out.println("Danh sách học sinh hiện có: ");
        for (int i =0;i< myArrayListService.size();i++){
            System.out.println(myArrayListService.elements[i]);
        }
    }

    public Student createStudent() {
        System.out.println("Nhập vào ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập vào địa chỉ:");
        String address = sc.nextLine();

        return new Student(id,name,address);
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

    public  void deleteStudent(int id){
        System.out.println("Nhập id cần xóa: ");
        id =Integer.parseInt(sc.nextLine());
        myArrayListService.remove(id);
        System.out.println("Đã xóa thành công id: "+id);
    }
}
