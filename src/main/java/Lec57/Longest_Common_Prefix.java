package Lec57;

import java.util.Arrays;
import java.util.HashMap;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        Longest_Common_Prefix obj = new Longest_Common_Prefix();
        for(String s : strs){
            obj.insert(s);
        }

        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();
        Node curr = obj.root;
        String s = strs[strs.length-1];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(curr.child.containsKey(ch) && curr.count==strs.length){
                sb.append(ch);
            }
            else{
                break;
            }

            curr = curr.child.get(ch);
        }

        return sb.toString();

    }

    public class Node{
        char ch;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isTerminal = false;
        int count = 0;

        public Node(char ch) {
            this.ch = ch;
        }
    }

    private Node root;

    public Longest_Common_Prefix(){
        Node newNode = new Node('*');
        this.root = newNode;
    }

    public void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }
            else{
                Node nn = new Node(ch);
                curr.child.put(ch, nn);
                curr = nn;
            }
            curr.count++;
        }

        curr.isTerminal = true;
    }

    public boolean search(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch)){
                return false;
            }
            curr = curr.child.get(ch);
        }

        return curr.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if(!curr.child.containsKey(ch)){
                return false;
            }
            curr = curr.child.get(ch);
        }

        return true;
    }
}
