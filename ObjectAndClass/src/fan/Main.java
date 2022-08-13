package fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMEDIUM());
        System.out.println(fan2.toString());
    }
}
