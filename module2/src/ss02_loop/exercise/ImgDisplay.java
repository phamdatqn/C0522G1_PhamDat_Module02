package ss02_loop.exercise;

import java.util.Scanner;

public class ImgDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Draw a triangle (Tam giác vuông)");
            System.out.println("2. Draw the square (Hình vuông)");
            System.out.println("3. Draw an empty rectangle (Hình chữ nhật rỗng)");
            System.out.println("4. Draw a rectangle (Hình chữ nhật)");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài của tam giác");
                    int longs = sc.nextInt();

                    //vuông trái dưới
                    StringBuilder show = new StringBuilder();
                    for (int i = 1; i <= longs; i++) {
                        for (int j = 1; j <= i; j++) {
                            show.append("*");
                        }
                        show.append("\n");
                    }
                    System.out.println(show);

                    //vuông trái trên
                    for (int i = longs; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }

                    //Vuông phải dưới
                    StringBuilder show1 = new StringBuilder();
                    for (int i = 0; i < longs; i++) {
                        for (int k = longs - 1; k > i; k--) {
                            show1.append(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            show1.append("*");
                        }
                        show1.append("\n");
                    }
                    System.out.println(show1);

                    //vuông trái trên
                    StringBuilder show3 = new StringBuilder();
                    for (int i = 0; i < longs; i++) {
                        for (int j = 0; j < i; j++) {
                            show3.append(" ");
                        }
                        for (int k = longs - i; k > 0; k--) {
                            show3.append("*");
                        }
                        show3.append("\n");
                    }
                    System.out.println(show3);
                    break;
                case 2:
                    System.out.println("Nhập vào cạnh của hình vuông");
                    longs = sc.nextInt();
                    for (int i = 0; i < longs; i++) {
                        for (int j = 0; j < longs; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    int weight;
                    int height;
                    System.out.println("Nhập chiều dài : ");
                    weight = sc.nextInt();
                    System.out.println("Nhập chiều rộng : ");
                    height = sc.nextInt();
                    for (int i = 1; i <= weight; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (i == 1 || i == weight || j == 1 || j == height) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("Nhập chiều dài : ");
                    weight = sc.nextInt();
                    System.out.println("Nhập chiều rộng : ");
                    height = sc.nextInt();
                    for (int i = 0; i < weight; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai mời nhập lại!!! \n");
            }
        }
    }
}





