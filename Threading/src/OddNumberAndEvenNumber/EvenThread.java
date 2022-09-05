package OddNumberAndEvenNumber;

public class EvenThread implements Runnable {
    private String name;

    public EvenThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println( name +" Number: " + i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

