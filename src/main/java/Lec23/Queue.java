package Lec23;

public class Queue {
    private int[] arr;
    private int front = 0;
    private int size = 0;

    public Queue(){
        arr = new int[5];
    }

    public Queue(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==arr.length;
    }

    public void enQueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        arr[(front+size)%arr.length] = item;
        size++;
    }

    public int deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int data = arr[front];
        front = (front+1)%arr.length;
        size--;
        return data;
    }

    public int getFront(){
        return arr[front];
    }

    public void display(){
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[(front+i)%arr.length]+" ");
        }
        System.out.println();
    }
}
