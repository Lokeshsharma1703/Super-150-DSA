package Lec28;

import Lec5.GasStation;

public class LinkedList {
    private class Node{
        int val;
        Node next;
        public Node(int item){
            this.val = item;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node node = new Node(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int item){
        Node node = new Node(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtPos(int item, int pos) throws Exception{
        if(pos<0 || pos>size){
            throw new Exception("index out of range");
        }
        if(pos==0){
            addFirst(item);
        }
        else if(pos==size){
            addLast(item);
        }
        else{
            Node kth = getNode(pos-1);
            Node node  = new Node(item);
            node.next = kth.next;
            kth.next = node;
            size++;
        }
    }

    private Node getNode(int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("index out of range");
        }
        Node temp = head;
        for(int i=1;i<=k;i++){
            temp = temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.val;
    }

    public int getLast(){
        return tail.val;
    }

    public int getIndex(int k) throws Exception{
        return getNode(k).val;
    }

    public int removeFirst() throws Exception{
        if(size<1){
            throw new Exception("LinkedList is empty");
        }
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        int n = head.val;
        head = head.next;
        size--;
        return n;
    }

    public int removeLast()throws Exception{
        if(size<1){
            throw new Exception("LinkedList is empty");
        }
        if(size==1){
            return removeFirst();
        }
        else{
            Node ss = getNode(size-2);
            int n = tail.val;
            tail = ss;
            tail.next = null;
            size--;
            return n;
        }
    }

    public int removeAtIndex(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("index out of range");
        }
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node prev = getNode(k-1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }

    public int getSize(){
        return size;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
