package core.basesyntax;

public class PasswordValidator extends RuntimeException {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || repeatPassword == null || password.length() < 10
                || repeatPassword.length() < 10 || !repeatPassword.equals(password)) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
