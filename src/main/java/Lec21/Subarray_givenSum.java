package Lec21;

import java.util.*;

public class Subarray_givenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 15;
        List<Integer> res = new ArrayList<>();
        int si = 0;
        int ei = 0;
        int sum = 0;
        while (ei<arr.length){
            sum+=arr[ei];
            while (sum>target && si<ei){
                sum-=arr[si];
                si++;
            }
            if(sum==target){
                res.add(si+1);
                res.add(ei+1);
                break;
            }
            ei++;
        }
        System.out.println(res);
    }
}
