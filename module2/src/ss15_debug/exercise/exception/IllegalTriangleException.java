package ss15_debug.exercise.exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super("Lỗi nhập, không được nhập số âm");
    }
}

