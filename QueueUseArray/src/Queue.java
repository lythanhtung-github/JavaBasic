public class Queue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public Queue(int size) {
        this.capacity = size;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        return currentSize == capacity;
    }

    public boolean isQueueEmpty(){
        return currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Full! Không thể thêm phần tử: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phần tử " + item + " đã được thêm vào Queue !");
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Hàng đợi rỗng! Không thể xóa");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Xóa thành công! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Xóa thành công! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }

}
