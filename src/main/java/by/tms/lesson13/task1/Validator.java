package by.tms.lesson13.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    protected static String login, password, confirmPassword;

    protected static boolean registration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.matches("[\\S]{1,19}")) {
            Validator.login = login;
        } else {
            throw new WrongLoginException("Логин должен быть менее 20 символов и без пробелов.)");
        }

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(password);
        boolean flag = matcher.find();
        if (password.matches("\\S{1,19}") && flag) { // не удалось подобрать REGEX, который бы брал все символы до 19 штук и проверял на наличие хотябы одной цифры
            Validator.password = password;
        } else {
            throw new WrongPasswordException("Пароль должен быть менее 20 символов, без пробелов и иметь хотябы одну цифру.");
        }

        if (password.equals(confirmPassword)) {
            Validator.confirmPassword = confirmPassword;
        } else {
            System.err.println("Пароли не совпадают.");
        }

        if (Validator.login != null && Validator.password != null && Validator.confirmPassword != null) {
            return true;
        }
        return false;
    }
}
