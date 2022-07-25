package ss17_binary_serialization.exercise.product.exception;

public class DuplicateIDException extends Exception {
    public DuplicateIDException(String message) {
        super(message);
    }
}
