package Lec24;

import Lec23.Queue;

public class Dynamic_Queue extends Queue {
    @Override
    public void enQueue(int item) throws Exception{
        if(isFull()){
            int[] a = new int[2*arr.length];
            for (int i = 0; i < size; i++) {
                a[i] = arr[(front+i)%arr.length];
            }
            arr = a;
            front = 0;
        }
        super.enQueue(item);
    }
}
