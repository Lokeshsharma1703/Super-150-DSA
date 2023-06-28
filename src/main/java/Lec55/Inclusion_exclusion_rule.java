package Lec55;

public class Inclusion_exclusion_rule {
    public static void main(String[] args) {
        int n = 1000;
        int[] arr = {2, 3, 5};

        System.out.println(count(arr, n));
    }

    private static int count(int[] arr, int n){
        int res = 0;

        for(int i=1; i < (1 << arr.length); i++){
            int c = countNumber(i, n, arr);
            if(countSetBit(i)%2==0){
                res -= c;
            }
            else{
                res += c;
            }
        }

        return res;
    }

    private static int countNumber(int i, int n, int[] arr){
        int pos = 0;
        int res = 1;

        while (i > 0){
            if((i&1) != 0){
                res *= arr[pos];
            }

            i >>= 1;
            pos++;
        }

        return n/res;
    }

    private static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            n = n&(n-1);
            count++;
        }

        return count;
    }
}
