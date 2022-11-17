package Lec23;

public class Queue_Demo {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.deQueue();
        q.deQueue();
        q.enQueue(60);
        q.display();
    }
}
