package Lec23;

public class Stack {
    private int[] arr;
    private int top;

    public Stack(){
        arr = new int[5];
        top = -1;
    }

    public Stack(int n){
        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isfull(){
        return top==arr.length-1;
    }

    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("Stack is full");
        }
        arr[++top] = item;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[top--];
    }

    public int peek(){
        return arr[top];
    }

    public int size(){
        return top+1;
    }

    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
