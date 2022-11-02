package Lec19;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,1, -1, 8, -11, 6,2,8};
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static void quickSort(int[] arr, int si, int ei){
        if(si>ei){
            return;
        }
        int pi = partion(arr, si, ei);
        quickSort(arr, si, pi-1);
        quickSort(arr, pi+1, ei);
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
