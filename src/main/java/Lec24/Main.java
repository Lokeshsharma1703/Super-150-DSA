package Lec24;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner dede = new Scanner(System.in);
        int times = dede.nextInt();
        while (times-->0){
            String la_De = dede.next();
            int lambai = la_De.length();
            int yeh = (lambai/3) + 2;
            String checkKR="";
            for (int loop = 0; loop < yeh; loop++) {
                checkKR = checkKR+"Yes";
            }
            int parinam = isSubstring(la_De, checkKR);
            if (parinam == -1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }



    private static int isSubstring(String pahla, String dusra)
    {
        return dusra.indexOf(pahla);
    }
}
