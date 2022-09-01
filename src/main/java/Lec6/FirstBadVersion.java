package Lec6;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isBadVersion(mid)==true){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isBadVersion(int n){
        return true;
    }
}
