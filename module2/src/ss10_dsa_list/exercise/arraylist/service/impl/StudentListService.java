package ss10_dsa_list.exercise.arraylist.service.impl;

import ss10_dsa_list.exercise.arraylist.model.Student;

import java.util.Scanner;

public class StudentListService {
    Scanner sc=new Scanner(System.in);
    static  MyArrayListService<Student> myArrayListService=new MyArrayListService<>();
    static {
        myArrayListService.add(new Student(1,"dat"));
        myArrayListService.add(new Student(2,"hoang"));
        myArrayListService.add(new Student(3,"thu"));
        myArrayListService.add(new Student(4,"tien"));
        myArrayListService.add(new Student(5,"manh"));
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
