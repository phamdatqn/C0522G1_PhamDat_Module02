package exercise_haitutor.mvclist_version2.util;

public class InputEmailUtil {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,2}$";

    public static String getEmail(String email) {
        while (true) {
            if (email.matches(EMAIL_REGEX)) {
                return email;
            } else {
                System.out.println("Nhập sai định, dạng mời nhập lại");
            }
        }
    }
}
