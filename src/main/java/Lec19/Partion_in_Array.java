package Lec19;

public class Partion_in_Array {
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,9,1,4};
        int res = partion(arr, 0, arr.length-1);
        System.out.println(res);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static int partion(int[] arr, int si, int ei){
        int item = arr[ei];
        int pi = si;
        for(int i=si;i<ei;i++){
            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp;
        return pi;
    }
}
