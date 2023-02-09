package Lec35;

import java.util.*;

public class Student_Client {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student("A", 14);
        arr[1] = new Student("B", 9);
        arr[2] = new Student("C", 18);
        arr[3] = new Student("D", 5);
        arr[4] = new Student("E", 21);
        print(arr);
//        bubble(arr);
        bubble(arr, new cc());
        print(arr);
    }

    public static void print(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString()+", ");
        }
        System.out.println();
    }

    static class cc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.age - o2.age;
        }
    }

    public static<T> void bubble(T[] arr, Comparator<T> obj){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(obj.compare(arr[j], arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

//    public static<T extends Comparable<T>> void bubble(T[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if(arr[j].compareTo(arr[j+1])>0){
//                    T temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }

//    public static void bubble(Student[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-2; j++) {
//                if(arr[j].age > arr[j+1].age){
//                    Student temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
}
