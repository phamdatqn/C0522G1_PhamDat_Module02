package ss15_debug.exercise.service;

import ss15_debug.exercise.exception.IllegalTriangleException;
import ss15_debug.exercise.model.Triangle;

public interface ITriangleService {
    Triangle checkTrilangle(int a, int b, int c) throws IllegalTriangleException;
}
