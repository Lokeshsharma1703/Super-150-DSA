package Lec16;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        String tiles = "ABAC";
        int[] freq = new int[26];
        for(int i=0;i<tiles.length();i++){
            freq[tiles.charAt(i)-'A']++;
        }
        System.out.println(subsequencePermutation("", freq));
    }
    private static int subsequencePermutation(String res, int[] freq){
//        System.out.println(res);
        int count = 0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                char ch = (char)('A'+i);
                freq[i]--;
                count+= subsequencePermutation(res+ch, freq)+1;
                freq[i]++;
            }
        }
        return count;
    }
}
