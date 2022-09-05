package account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String ACCOUNT_REGEX =   "^[_a-zA-Z0-9]{6,}$";

    public AccountExample() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
