package ss04_class_and_oop.exercise.stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        System.out.println("Start time: " + stopWatch.start() + " milisecond");

        long[] arr = new long[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) Math.floor(Math.random() * 100000);
        }

        Arrays.sort(arr);

        System.out.println("Mang da sap xep" + Arrays.toString(arr));

        System.out.println("End time: " + stopWatch.stop() + " milisecond");

        System.out.println("Sum time: " + stopWatch.getElapsedTime() + " milisecond");
    }
}

