package Lec4;

public class Search_min {
    public static void main(String[] args) {
        int[] arr = {2,3,-1,4,7,11,9};
        System.out.println(searchMin(arr));
    }
    public static int searchMin(int[] arr){
        int min = arr[0];
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
