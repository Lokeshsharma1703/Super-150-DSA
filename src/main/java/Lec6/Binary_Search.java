package Lec6;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,10,13,15,16,18};
        System.out.println(binarySearch(arr,13));
    }
    public static int binarySearch(int[] arr, int ele){
        int start_index = 0;
        int end_index = arr.length-1;
        while(start_index<=end_index){
            int mid = (start_index+end_index)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                start_index = mid+1;
            }
            else {
                end_index = mid-1;
            }
        }
        return -1;
    }
}
