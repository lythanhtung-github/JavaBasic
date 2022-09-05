package classname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";

    public ClassName() {
    }

    public boolean validate(String regex) {
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
