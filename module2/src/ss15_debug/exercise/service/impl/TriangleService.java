package ss15_debug.exercise.service.impl;

import ss15_debug.exercise.exception.IllegalTriangleException;
import ss15_debug.exercise.model.Triangle;
import ss15_debug.exercise.service.ITriangleService;

import java.util.Scanner;

public class TriangleService implements ITriangleService {

    @Override
    public Triangle checkTrilangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Không được nhập số âm");
        } else if (!(a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a)) {
            throw new IllegalTriangleException("Không là ba cạnh của tam giác");
        }
        return new Triangle(a, b, c);
    }

}







