package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class AreaRectangle {//diện tích hình chữ nhật
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập width: ");
        width=scanner.nextFloat();
        System.out.println("Nhập height: ");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("Diện Tích là: "+area);
    }


}
