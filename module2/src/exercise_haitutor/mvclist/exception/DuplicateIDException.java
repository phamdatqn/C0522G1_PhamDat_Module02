package exercise_haitutor.mvclist.exception;

public class DuplicateIDException extends Exception {
    public DuplicateIDException(String message) {
        super("Đã bị trùng ID, mời nhập lại");
    }
}
