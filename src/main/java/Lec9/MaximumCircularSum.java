package Lec9;

public class MaximumCircularSum {
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSum(arr));
    }
    private static int maxSum(int[] arr){
        int lsum = kadensAlgo(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i] = arr[i]* -1;
        }
        int midsum = kadensAlgo(arr);
        sum+=midsum;
        if(sum==0){
            return lsum;
        }
        return Math.max(midsum, lsum);
    }
    private static int kadensAlgo(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
