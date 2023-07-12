package Lec59;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,7,11};
        int[] arr2 = {2,3,4,8,9,12,13};
        if(arr1.length < arr2.length){
            System.out.println(findMedianSortedArrays(arr1, arr2));
        }
        else{
            System.out.println(findMedianSortedArrays(arr2, arr1));
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int lo = 0;
        int hi = n;

        while (lo <= hi){
            int cut1 = (lo + hi)/2;
            int cut2 = (n+m+1)/2 - cut1;

            int l1 = cut1==0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int r1 = cut1==n ? Integer.MAX_VALUE : nums1[cut1];

            int l2 = cut2==0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int r2 = cut2==m ? Integer.MAX_VALUE : nums2[cut2];

            if(l1 <= r2 && l2 <= r1){
                if((n+m)%2==0){
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                }
                else {
                    return Math.max(l1, l2);
                }
            }
            else if(l1 > r2){
                hi = cut1 - 1;
            }
            else{
                lo = cut1 + 1;
            }
        }

        return 0;
    }
}
