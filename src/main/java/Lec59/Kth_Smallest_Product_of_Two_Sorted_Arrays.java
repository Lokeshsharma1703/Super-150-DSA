package Lec59;

public class Kth_Smallest_Product_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {-4,-2,0,3};
        int[] nums2 = {2,4};
        int k = 6;

        System.out.println(kthSmallestProduct(nums1, nums2, k));
    }

    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long lo = -1000_000_0000l;
        long hi =  1000_000_0000l;
        long res = 0;
        while(lo <= hi){
            long mid = (lo + hi)/2;

            if(countProduct(nums1, nums2, mid) >= k){
                res = mid;
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }

        return res;
    }

    private static long countProduct(int[] nums1, int[] nums2, long product){
        long res = 0;

        for(int ele : nums1){
            if(ele >= 0) {
                int lo = 0;
                int hi = nums2.length-1;
                long count = 0;

                while(lo <= hi){
                    int mid = (lo + hi)/2;

                    if((long)(ele) * nums2[mid] <= product){
                        count = mid+1;
                        lo = mid+1;
                    }
                    else {
                        hi = mid-1;
                    }
                }

                res += count;
            }
            else{
                int lo = 0;
                int hi = nums2.length-1;
                long count = 0;

                while(lo <= hi){
                    int mid = (lo + hi)/2;

                    if((long)(ele) * nums2[mid] <= product){
                        count = nums2.length-mid;
                        hi = mid-1;
                    }
                    else {
                        lo = mid+1;
                    }
                }

                res += count;
            }
        }

        return res;
    }

}
