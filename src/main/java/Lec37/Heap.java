package Lec37;

import java.util.*;

public class Heap {
    private ArrayList<Integer> list = new ArrayList<>();

    public void add(int item){
        list.add(item);
        upheapify(list.size()-1);
    }

    private void upheapify(int ci){
        int pi = (ci-1)/2;

        if(list.get(pi) > list.get(ci)){
            swap(pi, ci);
            upheapify(pi);
        }
    }
    private void swap(int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public int remove(){
        swap(0, list.size()-1);
        int rv = list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi){
        int lft = 2*pi +1;
        int rgt = 2*pi +2;

        int min = pi;
        if(lft < list.size() && list.get(min) > list.get(lft)){
            min = lft;
        }
        if(rgt < list.size() && list.get(min) > list.get(rgt)){
            min = rgt;
        }
        if(min != pi){
            swap(min, pi);
            downheapify(min);
        }
    }

    public int min(){
        return list.get(0);
    }

    public int size(){
        return list.size();
    }

    public void display(){
        System.out.println(list);
    }
}
