public class Main {
    public static void main(String[] args) {
        Queue  queue = new Queue();
        for(int i = 1; i <= 10; i++){
            queue.enQueue(i);
        }
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
