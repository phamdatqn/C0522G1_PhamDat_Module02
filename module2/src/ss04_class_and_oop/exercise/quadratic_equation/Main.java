package ss04_class_and_oop.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a (a#0):");
        double a = sc.nextDouble();

        System.out.println("Nhap b:");
        double b = sc.nextDouble();

        System.out.println("Nhap c:");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDelta() < 0) {
            System.out.println("Phuong trinh vo nghiem");

        } else if (quadraticEquation.getDelta() == 0) {
            System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.2f", quadraticEquation.getRoot1());

        } else {
            System.out.printf("Phuong trinh co 2 nghiem phan biet la: \nx1 = %.2f \nx2 = %.2f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());

        }
    }
}


