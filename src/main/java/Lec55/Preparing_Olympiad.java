package Lec55;

//  https://codeforces.com/problemset/problem/550/B

import java.util.Scanner;

public class Preparing_Olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countContest(arr, l, r, x));
    }

    private static int countContest(int[] arr, int l, int r, int x){
        int n = arr.length;
        int res = 0;

        for (int i = 3; i < (1<<n); i++) {   // set bits of 0, 1, 2 are less than 2
            if(countSetBit(i) >= 2){
                if(isItPossible(arr, l, r, x, i)){
                    res++;
                }
            }
        }

        return res;
    }

    private static boolean isItPossible(int[] arr, int l, int r, int x, int i){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pos = 0;
        while (i>0){
            if((i&1) != 0){
                sum += arr[pos];
                min = Math.min(min, arr[pos]);
                max = Math.max(max, arr[pos]);
            }
            i >>= 1;
            pos++;
        }
        if(sum >= l && sum <= r && (max-min)>=x){
            return true;
        }

        return false;
    }

    private static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            n = n&(n-1);
            count++;
        }

        return count;
    }
}
