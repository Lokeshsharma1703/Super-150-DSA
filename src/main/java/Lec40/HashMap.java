package Lec40;

import java.util.*;

public class HashMap<K, V> {
    public class Node{
        K key;
        V value;
        Node next;
        public Node(){}
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<Node> bucketArray;
    int size = 0;

    public HashMap(int x){
        this.bucketArray = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            this.bucketArray.add(null);
        }
    }
    public HashMap(){
        this(4);
    }

    public void put(K key, V value){
        int bn = hashFunction(key);

        Node temp = bucketArray.get(bn);
        while (temp!=null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        Node curr = new Node(key, value);
        temp = this.bucketArray.get(bn);
        curr.next = temp;
        this.bucketArray.set(bn, curr);
        size++;

        double lf = (1.0 * this.size)/this.bucketArray.size();
        double thf = 2.0;
        if(lf > thf){
            reHashing();
        }
    }

    public V get(K key){
        int bn = hashFunction(key);
        Node temp = this.bucketArray.get(bn);
        while (temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean containsKey(K key){
        int bn = hashFunction(key);
        Node temp = this.bucketArray.get(bn);
        while (temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public V remove(K key){
        int bn = hashFunction(key);
        Node curr = this.bucketArray.get(bn);
        Node prev = null;
        while (curr!=null){
            if(curr.key.equals(key)){
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if(curr==null){
            return null;
        }
        this.size--;
        if(prev==null){
            this.bucketArray.set(bn, curr.next);
            curr.next = null;
        }
        else {
            prev.next = curr.next;
            curr.next = null;
        }
        return curr.value;
    }

    public int hashFunction(K key){
        int bucketNumber = key.hashCode()%this.bucketArray.size();
        if(bucketNumber < 0){
            bucketNumber += this.bucketArray.size();
        }
        return bucketNumber;
    }

    private void reHashing(){
        ArrayList<Node> newBucketArray = new ArrayList<>();
        for (int i = 0; i < this.bucketArray.size() * 2; i++) {
            newBucketArray.add(null);
        }
        ArrayList<Node> oldBucketArray = this.bucketArray;
        this.bucketArray = newBucketArray;
        this.size = 0;
        for(Node node : oldBucketArray){
            while (node!=null){
                put(node.key, node.value);
                node = node.next;
            }
        }
    }

    @Override
    public String toString(){
        String s = "{";
        for(Node node : this.bucketArray){
            while (node!=null){
                s = s + node.key+"="+node.value+", ";
                node = node.next;
            }
        }
        s = s+"}";
        return s;
    }

}
