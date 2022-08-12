package quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        do {
            System.out.println("Nhập a: ");
            a = sc.nextDouble();
        } while (a == 0);

        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập c: ");
        c = sc.nextDouble();

        QuadraticEquation quadraticequation = new QuadraticEquation(a, b, c);
        double dt = quadraticequation.getDiscriminant();
        System.out.println(dt);
        if (dt == 0) {
            double x = quadraticequation.getRoot1();
            System.out.printf("Phương trình có 1 nghiệm là x = %s", x);
        } else if (dt > 0) {
            double x1 = quadraticequation.getRoot1();
            double x2 = quadraticequation.getRoot2();
            System.out.printf("Phương trình có 2 nghiệm phân biệt là x1 = %s và x2 = %s", x1, x2);
        } else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
}
