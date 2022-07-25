package ss17_byte_stream.exercise.copy_binary_file.exception;

public class FileExistsException extends Exception{
    public FileExistsException(String message) {
        super(message);
    }
}
