package ss15_debug.exercise.service;

import ss15_debug.exercise.exception.IllegalTriangleException;

public interface ITriangleService {
    void checkTrilangle(int a, int b, int c) throws IllegalTriangleException;
}
