package Lec37;

import java.util.*;

public class Generic_Heap<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
        upheapify(list.size()-1);
    }

    private void upheapify(int ci){
        int pi = (ci-1)/2;

        if(isLarger(list.get(pi), list.get(ci))>0){
            swap(pi, ci);
            upheapify(pi);
        }
    }

    private int isLarger(T o1, T o2){
        return o1.compareTo(o2);
    }

    private void swap(int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public T remove(){
        swap(0, list.size()-1);
        T rv = list.remove(list.size()-1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi){
        int lft = 2*pi +1;
        int rgt = 2*pi +2;

        int min = pi;
        if(lft < list.size() && isLarger(list.get(min), list.get(lft))>0){
            min = lft;
        }
        if(rgt < list.size() && isLarger(list.get(min), list.get(rgt))>0){
            min = rgt;
        }
        if(min != pi){
            swap(min, pi);
            downheapify(min);
        }
    }

    public T min(){
        return list.get(0);
    }

    public int size(){
        return list.size();
    }

    public void display(){
        System.out.println(list);
    }
}
