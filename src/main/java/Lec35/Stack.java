package Lec35;

//public class Stack implements Stack_I {
//    @Override
//    public int pop(){
//        return 0;
//    }
//
//    @Override
//    public int push(int ele){
//        return 0;
//    }
//}


public class Stack implements Min_Stack_I, Stack_I{

    @Override
    public int getMin() {
        return 0;
    }

    @Override
    public int pop() {
        int temp = this.i;
//        this.i = 45;      not possible because i is by default final
        return temp;
    }

    @Override
    public int push(int ele) {
        return 0;
    }
}