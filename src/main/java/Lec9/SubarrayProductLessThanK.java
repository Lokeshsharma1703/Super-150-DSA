package Lec9;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr= {10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(arr, 100));
    }
    private static int numSubarrayProductLessThanK(int[] nums, int k){
        int count=0;
        int si=0;
        int ei=0;
        int product=1;
        while(ei<nums.length){
            //grow window
            product*=nums[ei];

            //window shrink
            while(product>=k && si<=ei){
                product=product/nums[si];
                si++;
            }

            //calculate answer
            count = count + ei-si+1;
            ei++;
        }
        return count;
    }
}
