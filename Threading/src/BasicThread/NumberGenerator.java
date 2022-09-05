package BasicThread;

public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Generator " + name + " printing the count " + i);
                System.out.println(" HashCode: " + hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
        System.out.println("Generator " + name + " run is over");
    }
}

