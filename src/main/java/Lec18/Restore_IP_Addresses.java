package Lec18;

import java.util.*;

public class Restore_IP_Addresses {
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> res = new ArrayList<>();
        if(s.length()<4 || s.length()>12){
            return;
        }
        generateIPAddressess(""+s.charAt(0), s, 1, 3, res);
        System.out.println(res);
    }
    private static void generateIPAddressess(String ip, String s, int index, int blocks, List<String> res){
        if(blocks<0){
            return;
        }
        if(index<s.length()){
            generateIPAddressess(ip+s.charAt(index), s, index+1, blocks, res);
            generateIPAddressess(ip+"."+s.charAt(index), s, index+1, blocks-1, res);
        }
        else if(index==s.length() && blocks==0){
            if(isValidIP(ip)){
                res.add(ip);
            }
        }
        else{
            return;
        }
    }
    private static boolean isValidIP(String ip){
        String[] addressess = ip.split("\\.");
        if(addressess.length==4){
            boolean flag = true;
            for(String i:addressess){
                int num = Integer.parseInt(i);
                if((i.charAt(0)=='0' && i.length()!=1)||num>255){
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        return false;
    }
}
