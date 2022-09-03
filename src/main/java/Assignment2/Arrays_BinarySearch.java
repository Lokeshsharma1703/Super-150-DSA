//Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.
//
//        1.It reads a number N.
//        2.Take Another N numbers as input in Ascending Order and store them in an Array.
//        3.Take Another number M as input and find that number in Array.
//        4.If the number M is found, index of M is returned else -1 is returned.Print the number returned.
//
//        Input Format
//        Constraints
//        N cannot be Negative. Range of Numbers N and M can be between -1000000000 to 1000000000
//
//        Output Format
//        Sample Input
//        5
//        3
//        5
//        6
//        9
//        78
//        6
//        Sample Output
//        2
//        Explanation
//        Array = {3, 5, 6, 9, 78}, target number = 6 . Index of number 6 in the given array = 2. Write Binary search to find the number in given array as discuss in the class.

package Assignment2;

import java.util.Scanner;

public class Arrays_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        int ele = sc.nextInt();
        System.out.println(searchElement(arr, ele));
    }
    private static int searchElement(int[] arr, int ele){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==ele)
                return mid;
            else if(arr[mid]<ele)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
