//Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.
//
//        Input Format
//        The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.
//
//        Constraints
//        2 ≤ N ≤ 10^6
//
//        Output Format
//        A single integer denoting the maximum perfectness achievable.
//
//        Sample Input
//        2
//        abba
//        Sample Output
//        4
//        Explanation
//        We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
//        Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.

package Assignment2;

import java.util.Scanner;

public class KartikBhaiyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int flipa = perfectString(s, 'a', k);
        int flipb = perfectString(s, 'b', k);
        System.out.println(Math.max(flipa, flipb));
    }
    private static int perfectString(String s, char ch, int k){
        int si = 0;
        int ei = 0;
        int ans = 0;
        int flip = 0;
        while(ei<s.length()){
            //grow
            if(s.charAt(ei)==ch){
                flip++;
            }
            //shrink
            while (flip>k){
                if(s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            //calculate answer
            ans=Math.max(ans, (ei-si+1));
            ei++;
        }
        return ans;
    }
}
