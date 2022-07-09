package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius (Độ F sang C)");
            System.out.println("2. Celsius to Fahrenheit (Độ C sang F)");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn phím: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println(fahrenheit + " độ F bằng " + fahrenheitToCelsius(fahrenheit) + " độ C");
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println(celsius + " độ C bằng " + celsiusToFahrenheit(celsius) + " độ F");
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
