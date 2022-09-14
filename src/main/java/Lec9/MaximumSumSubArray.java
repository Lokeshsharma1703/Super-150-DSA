package Lec9;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-7, 4,6};
        System.out.println(sum(arr));
    }
    private static int sum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                ans = Math.max(ans,sum);
            }
        }
        return ans;
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
