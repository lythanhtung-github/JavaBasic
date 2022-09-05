package OddNumberAndEvenNumber;

public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread("Odd");
        EvenThread even = new EvenThread("Even");

        Thread num1 = new Thread(odd);
        Thread num2 = new Thread(even);

        num1.start();
        try {
            num1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num2.start();
        try {
            num2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
