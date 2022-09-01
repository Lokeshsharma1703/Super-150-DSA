package Lec6;

public class GreaterPower {
    public static void main(String[] args) {
        System.out.println(root(47));
    }
    public static int root(int n){
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid<=n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
