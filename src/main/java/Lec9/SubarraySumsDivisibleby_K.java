package Lec9;

public class SubarraySumsDivisibleby_K {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(arr, k));
    }
    public static int subarraysDivByK(int[] arr, int k) {
        int sum = 0;
        int[] frq = new int[k];
        frq[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int idx = sum % k;
            if (idx < 0) {
                idx += k;
            }
            frq[idx] = frq[idx] + 1;

        }

        int ans = 0;
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] >= 2) {
                int p = frq[i];
                ans = ans + (p * (p - 1)) / 2;
            }
        }
        return ans;
    }
}
