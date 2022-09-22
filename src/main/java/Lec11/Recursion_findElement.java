package Lec11;

public class Recursion_findElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,1,3,7,3,6};
        System.out.println(findItem(arr, 3, arr.length-1));
    }
    private static int findItem(int[] arr, int ele, int pos){
        if(pos<0){
            return -1;
        }
        if(arr[pos]==ele){
            return pos;
        }
        return findItem(arr, ele, pos-1);
    }
}
