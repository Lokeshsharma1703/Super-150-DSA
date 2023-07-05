package Lec57;

//  https://www.hackerrank.com/challenges/ctci-contacts/problem

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Tries_Contacts_Hackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        TTrie t = new TTrie();

        IntStream.range(0, n).forEach(nItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String op = firstMultipleInput[0];

                String contact = firstMultipleInput[1];

                if(op.equals("add")){
                    t.insert(contact);
                }
                else if(op.equals("find")){
                    System.out.println(t.search(contact));
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

class TTrie {
    public class nNode {
        char ch;
        HashMap<Character, nNode> child = new HashMap<>();
        boolean isTerminal = false;
        int count = 0;

        public nNode(char ch) {
            this.ch = ch;
        }
    }

    private nNode root;

    public TTrie(){
        nNode newNode = new nNode('*');
        this.root = newNode;
    }

    public void insert(String word) {
        nNode curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }
            else{
                nNode nn = new nNode(ch);
                curr.child.put(ch, nn);
                curr = nn;
            }
            curr.count++;
        }

        curr.isTerminal = true;
    }

    public int search(String word) {
        nNode curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch)){
                return 0;
            }
            curr = curr.child.get(ch);
        }

        return curr.count;
    }
}

