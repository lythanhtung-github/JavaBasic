public class Queue {
    private Node front = null;
    private Node rear = null;

    public void enQueue(int value) {
        Node temp = new Node();
        temp.data = value;
        if (this.front == null) {
            this.front = temp;
        } else {
            this.rear.link = temp;
        }
        this.rear = temp;
        this.rear.link = this.front;
    }

    public int deQueue(){
        if (this.front ==  null)
        {
            return -1;
        }

        int value;
        if (this.front == this.rear)
        {
            value = this.front.data;
            this.front =  null;
            this.rear =  null;
        }
        else
        {
            Node  temp = this.front;
            value = temp .data;
            this.front = this.front.link;
            this.rear.link= this.front;
        }
        return value ;
    }

    public void displayQueue(){
        Node temp = this.front;
        System.out.print(" Queue : ");
        while (temp .link != this.front)
        {
            System.out.printf("%s ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%s\n", temp .data);
    }
}
