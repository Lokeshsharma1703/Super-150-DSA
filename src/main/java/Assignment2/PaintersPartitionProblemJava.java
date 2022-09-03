//Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.
//
//        Note that:
//
//        Every painter can paint only contiguous segments of boards.
//        A board can only be painted by 1 painter at maximum.
//        Input Format
//        First line contains K which is the number of painters. Second line contains N which indicates the number of boards. Third line contains N space separated integers representing the length of each board.
//
//        Constraints
//        1 <= K <= 10
//        1 <= N <= 10
//        1<= Length of each Board <= 10^8
//
//        Output Format
//        Output the minimum time required to paint the board.
//
//        Sample Input
//        2
//        2
//        1 10
//        Sample Output
//        10

package Assignment2;

import java.util.*;

public class PaintersPartitionProblemJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int painters = sc.nextInt();
        int nob = sc.nextInt();
        int[] boards = new int[nob];
        for(int i=0;i<nob;i++)
            boards[i] = sc.nextInt();
        System.out.println(calculateMinUnits(boards,painters));
    }
    private static int calculateMinUnits(int[] boards, int painters){
        int low = max(boards);
        int high = sum(boards);
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nop(boards,mid)<=painters){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    private static int max(int[] boards){
        int max = Integer.MIN_VALUE;
        for(int i:boards){
            if(i>max)
                max = i;
        }
        return max;
    }
    private static int sum(int[] boards){
        int sum = 0;
        for(int i:boards){
            sum+=i;
        }
        return sum;
    }
    private static int nop(int[] boards, int max){
        int sum = 0;
        int painters = 1;
        for(int i=0;i<boards.length;i++){
            sum+=boards[i];
            if(sum>max){
                sum = boards[i];
                painters++;
            }
        }
        return painters;
    }
}
