package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberReader {
    final static String[] arrayLessThan20 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    final static String[] arrayLessThan100 = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void numberLessThan100(int number) {
        if (number < 20) {
            System.out.print(arrayLessThan20[number]);
        } else {
            System.out.print(arrayLessThan100[number / 10]);
            if (number % 10 != 0) {
                System.out.print(" " + arrayLessThan20[number % 10]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số (từ 0 đến 999): ");
        int number = sc.nextInt();
        if (number < 0 || number >= 1000) {
            System.out.println("out of ability!");
        } else if (number < 100) {
            numberLessThan100(number);
        } else {
            numberLessThan100(number / 100);
            System.out.print(" hundred");
            if (number % 100 != 0) {
                System.out.print(" and ");
                numberLessThan100(number % 100);
            }
        }
    }
}

