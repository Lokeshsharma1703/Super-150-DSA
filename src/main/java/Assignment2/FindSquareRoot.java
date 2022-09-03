//Implement squareroot(x).
//
//        Compute and return the square root of x.
//
//        If x is not a perfect square, return floor(sqrt(x)).
//        Note: DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
//
//        Input Format
//        An integer A .
//
//        Constraints
//        0 <= A <10000000000
//
//        Output Format
//        Squareroot of A.
//
//        Sample Input
//        25
//        Sample Output
//        5

package Assignment2;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findSquareRoot(num));
    }
    private static int findSquareRoot(int num){
        int low = 1;
        int high = num;
        int ans = 0;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid==num)
                return (int)mid;
            else if(mid*mid<num){
                ans = (int)mid;
                low = (int)(mid+1);
            }
            else
                high = (int)(mid-1);
        }
        return ans;
    }
}
