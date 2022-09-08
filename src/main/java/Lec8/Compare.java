package Lec8;

public class Compare {
    public static void main(String[] args) {
        String s1 = "Kartik";
        String s2 = "Karan";
        int i=0;
        int j=0;
        int count=0;
        while(i<s1.length() && j<s2.length()){
            if(s2.charAt(i)>s1.charAt(i)){
                System.out.println(-1);
                count++;
                break;
            }
            else if(s1.charAt(i)>s2.charAt(i)){
                System.out.println(1);
                count++;
                break;
            }
            i++;
            j++;
        }
        if(count==0)
            if(s1.length()>s2.length())
                System.out.println(1);
            else if(s2.length()>s1.length())
                System.out.println(-1);
            else
                System.out.println(0);
//        System.out.println(isCompare(s1,s2));
    }
//    private static int isCompare(String s1, String s2){
//        int j=0;
//        int i=0;
//        while(i<s1.length() && j<s2.length()){
//            if(s1.charAt(i)>s2.charAt(i))
//                return s1.charAt(i) - s2.charAt(i);
//            else if(s2.charAt(i)>s1.charAt(i))
//                return s2.charAt(i)-s1.charAt(i);
//            i++;
//            j++;
//        }
//        return s1.length()-s2.length();
//    }
}
