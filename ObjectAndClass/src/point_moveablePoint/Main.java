package point_moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        MoveAblePoint moveAblePoint = new MoveAblePoint(1.1f, 2.2f, 0.1f, 0.1f);
        System.out.println(moveAblePoint);

        System.out.println(moveAblePoint.move());
        System.out.println(moveAblePoint.move());
        System.out.println(moveAblePoint.move());
        System.out.println(moveAblePoint.move());
        System.out.println(moveAblePoint.move());

        System.out.println(moveAblePoint);
    }
}
