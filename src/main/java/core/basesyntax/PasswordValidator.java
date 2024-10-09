package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 8;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }
        if (password.length() < MIN_PASSWORD_LENGTH || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
