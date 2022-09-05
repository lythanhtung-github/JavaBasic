package OddNumberAndEvenNumber;

public class OddThread implements Runnable{
    private String name;

    public OddThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println( name +" Number: " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
