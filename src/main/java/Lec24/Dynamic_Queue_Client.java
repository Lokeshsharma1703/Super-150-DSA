package Lec24;

public class Dynamic_Queue_Client {
    public static void main(String[] args) throws Exception {
        Dynamic_Queue q = new Dynamic_Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.display();
        q.enQueue(60);
        q.enQueue(70);
        q.display();
    }
}
