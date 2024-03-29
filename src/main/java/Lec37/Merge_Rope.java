package Lec37;

import java.util.PriorityQueue;

public class Merge_Rope {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(cost(arr));
    }
    public static int cost(int[] arr){
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            sum += (a+b);
            pq.add(a+b);
        }
        return sum;
    }
}
