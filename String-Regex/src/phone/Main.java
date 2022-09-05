package phone;

import Email.EmailExample;

public class Main {
    public static final String[] validPhone = new String[]{"(84)-(0978489648)", "(84)-(0232489642)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        Phone phone = new Phone();
        for (String phoneNumber : validPhone) {
            boolean isValid = phone.validate(phoneNumber);
            System.out.println("Email is " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : invalidPhone) {
            boolean isValid = phone.validate(phoneNumber);
            System.out.println("Email is " + phoneNumber + " is valid: " + isValid);
        }
    }
}
