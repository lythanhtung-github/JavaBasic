package classname;

public class Main {

    public static final String[] validAccount = new String[]{"C0422G", "C0622H",};
    public static final String[] invalidAccount = new String[]{"c0622s", "C111123"};

    public static void main(String args[]) {
        ClassName ClassName = new ClassName();
        for (String className : validAccount) {
            boolean isValid = ClassName.validate(className);
            System.out.println("Account is " + className + " is valid: " + isValid);
        }
        for (String className : invalidAccount) {
            boolean isValid = ClassName.validate(className);
            System.out.println("Account is " + className + " is valid: " + isValid);
        }
    }
}

