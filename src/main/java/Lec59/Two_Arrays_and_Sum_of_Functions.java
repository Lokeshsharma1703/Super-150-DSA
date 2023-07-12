package Lec59;

// https://codeforces.com/problemset/problem/1165/E

import java.util.*;

public class Two_Arrays_and_Sum_of_Functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long[] a=new long[n];
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            a[i]=x*(i+1)*(n-i);
        }

        Long[] b=new Long[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextLong();
        }

        int mod=998244353;
        long ans=0;
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());

        for(int i=0;i<n;i++){
            ans+=(((a[i]%mod)*b[i])%mod);
        }
        System.out.println(ans%mod);
    }
}
