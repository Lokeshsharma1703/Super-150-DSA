package Lec4;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {2,3,-1,4,7,11,9};
        System.out.println(Search(arr,11));
    }
    public static int Search(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)
                return i;
        }
        return -1;
    }
}
