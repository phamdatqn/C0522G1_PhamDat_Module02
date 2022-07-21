package ss15_debug.exercise.controller;

import ss15_debug.exercise.exception.IllegalTriangleException;
import ss15_debug.exercise.service.impl.TriangleService;

import java.util.Scanner;

public class MainController {
    public static void mainController() {
        TriangleService triangle = new TriangleService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập cạnh a: ");
                int a = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập cạnh b: ");
                int b = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập cạnh c: ");
                int c = Integer.parseInt(sc.nextLine());

                System.out.println(triangle.checkTrilangle(a, b, c));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ, mời nhập lại !");

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



