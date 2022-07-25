package ss17_binary_serialization.exercise.copy_binary_file.exception;

public class FileExistsException extends Exception{
    public FileExistsException(String message) {
        super(message);
    }
}
