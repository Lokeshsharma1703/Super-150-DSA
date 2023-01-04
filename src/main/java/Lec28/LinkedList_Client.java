package Lec28;

public class LinkedList_Client {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.display();
        list.addLast(5);
        list.addLast(6);
        list.display();
        list.addAtPos(10, 3);
        list.addAtPos(20,6);
        list.display();
        list.removeFirst();
        list.removeLast();
        list.display();
        list.removeAtIndex(2);
        list.display();
        list.removeAtIndex(3);
        list.display();
    }
}
