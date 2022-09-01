package Lec6;

import java.util.Scanner;

public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int nos = sc.nextInt();
            int[] pages = new int[n];
            for(int j=0;j<n;j++){
                pages[j] = sc.nextInt();
            }
            System.out.println(minPages(pages, nos));
        }
    }
    public static int minPages(int[] pages, int nos){
        int low = 0;
        int high = 0;
        for(int i=0;i<pages.length;i++){
            high+=pages[i];
        }
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(pages, mid, nos)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] pages, int mid, int nos){
        int s = 1;
        int readpage = 0;
        int i=0;
        while(i<pages.length){
            if(readpage+pages[i]<=mid){
                readpage+=pages[i];
                i++;
            }
            else{
                readpage = 0;
                s++;
            }
            if(s>nos)
                return false;
        }
        return true;
    }
}
