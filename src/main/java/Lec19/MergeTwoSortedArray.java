package Lec19;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,10,11,15,18};
        int[] arr2 = {1,2,3,4,6,10,15,19,20,24,27,28};
        int[] res = mergeTwoSortedArray(arr1, arr2);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int i = 0;
        int j=0;
        int k=0;
        int[] res = new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k++] = arr1[i++];
            }
            else {
                res[k++] = arr2[j++];
            }
        }
        while (i<arr1.length){
            res[k++] = arr1[i++];
        }
        while (j<arr2.length){
            res[k++] = arr2[j++];
        }
        return res;
    }
}