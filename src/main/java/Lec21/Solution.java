package Lec21;

import java.util.*;
public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int i=1, j=3*n-1;
            System.out.println((n+1)/2);
            while(i<j)
            {
                System.out.print(i+" "+j);
                i = i+3;
                j = j-3;
            }
		    t--;
        }
    }
}