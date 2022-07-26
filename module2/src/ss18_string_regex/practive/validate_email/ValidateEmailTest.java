package ss18_string_regex.practive.validate_email;

public class ValidateEmailTest {
    private static ValidateEmail validateEmail;
    public static final String[] validEmail = new String[] { "a@gmail-com.vn", "ab@yahoo.com", "abc@hotmail.com.vn" };
    public static final String[] invalidEmail = new String[] { "abc@hotmail.com.vn.hot", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        validateEmail = new ValidateEmail();
        for (String email : validEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
