package Lec57;

import java.util.*;

public class Trie {
    public class Node{
        char ch;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isTerminal = false;

        public Node(char ch) {
            this.ch = ch;
        }
    }

    private Node root;

    public Trie(){
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
