package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
