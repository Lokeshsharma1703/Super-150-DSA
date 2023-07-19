package Lec61;

import java.math.BigInteger;
import java.util.*;

public class Additive_Number {
    public static void main(String[] args) {
        String s = "199100199";

        System.out.println(isAdditiveNumber(s));
    }

    public static boolean isAdditiveNumber(String num) {
        List<BigInteger> ll = new ArrayList<>();
        return isAdditive(num, ll);
    }

    private static boolean isAdditive(String ques, List<BigInteger> ll){
        if(ques.length()==0){
            if(ll.size()>=3){
                return true;
            }
            return false;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s1 = ques.substring(0, i);

            if(nonLeading(s1) && validAdditive(ll, s1)) {
                ll.add(new BigInteger(s1));
                boolean res = isAdditive(ques.substring(i), ll);

                if(res){
                    return res;
                }

                ll.remove(ll.size()-1);
            }
        }

        return false;
    }

    private static boolean nonLeading(String s){
        if(s.length()==1){
            return true;
        }

        return s.charAt(0) != '0';
    }

    private static boolean validAdditive(List<BigInteger> ll, String s){
        if(ll.size() <= 1){
            return true;
        }

        BigInteger first = ll.get(ll.size()-1);
        BigInteger second = ll.get(ll.size()-2);

        BigInteger res = new BigInteger(s);

        return first.add(second).equals(res);
    }
}