package Lec17;

import java.util.Scanner;

public class RatChasesitsCheese {
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0;i<arr.length;i++){
            String s = scanner.next();
            for(int j=0;j<s.length();j++){
                arr[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        hasPath(arr, 0, 0, ans);
        if(flag==false){
            System.out.println("NO PATH FOUND");
        }
    }
    private static void hasPath(char[][] arr, int cc, int cr, int[][] ans){
        if(cr==arr.length-1 && cc==arr[0].length-1 && arr[cr][cc]!='X'){
            ans[cr][cc] = 1;
            display(ans);
            flag = true;
            return;
        }
        if(cr<0 || cc<0 || cr>=arr.length || cc>=arr[0].length || arr[cr][cc]=='X'){
            return;
        }
        arr[cr][cc] = 'X';
        ans[cr][cc] = 1;
//        hasPath(arr, cc, cr-1, ans); //up
//        hasPath(arr, cc, cr+1, ans); //down
//        hasPath(arr, cc-1, cr, ans); //left
//        hasPath(arr, cc+1, cr, ans); //right

        int r[] = {-1,1,0,0};
        int c[] = {0,0,-1,1};
        for(int i=0;i<c.length;i++){
            hasPath(arr, cc+c[i], cr+r[i], ans);
        }
        arr[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    private static void display(int[][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
