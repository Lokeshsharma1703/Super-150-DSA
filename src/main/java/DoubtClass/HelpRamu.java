package DoubtClass;

import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int[] cost = new int[4];
            for(int i=0;i<4;i++){
                cost[i] = sc.nextInt();
            }
            int nor = sc.nextInt();
            int noc = sc.nextInt();
            int[] rick = new int[nor];
            int[] cabs = new int[noc];
            for(int i=0;i<nor;i++)
                rick[i] = sc.nextInt();
            for(int i=0;i<noc;i++)
                cabs[i] = sc.nextInt();
            System.out.println(solution(cost, rick, cabs));
        }
    }
    private static int solution(int[] cost, int[] rick, int[] cabs){
        int res = 0;
        int sum = 0;
        for(int i=0;i<rick.length;i++){
            sum+=Math.min(cost[0]*rick[i],cost[1]);
        }
        res += Math.min(sum, cost[2]);
        sum=0;
        for(int i=0;i<cabs.length;i++){
            sum+=Math.min(cost[0]*cabs[i],cost[1]);
        }
        res += Math.min(sum, cost[2]);
        res=Math.min(res, cost[3]);
        return res;
    }
}
