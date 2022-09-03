package CheckEmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    // Class kiểm định dạng email
    public boolean validate(final String email) {

        matcher = pattern.matcher(email);
        return matcher.matches();

    }

    // main và test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        EmailValidator emailValidator = new EmailValidator();
        if (emailValidator.validate(email)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }
}
/*Ký hiệu	Mô tả
 *   ^	                Bắt đầu chuỗi String hoặc một dòng
 *   [A-Za-z0-9]+	    Email address phải bắt đầu với “[A-Za-z0-9]+” và có ít nhất một ký tự
 *   [A-Za-z0-9]	        Domain phải sau @ và ký tự phải nằm trong [A-Za-z0-9]
 *   \\.[A-Za-z0-9]	    Sau domain là phần mở rộng của domain sau dấu chấm, ví dụ: (.com, .net, .org)
 *   $	                Kết thúc chuỗi String hoặc kết thúc dòng*
 */
