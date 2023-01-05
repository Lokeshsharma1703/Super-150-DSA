package Lec29;

public class Cycle_Removal {

    public static void main(String[] args) throws Exception {
        LinkedList cc = new LinkedList();
        cc.addLast(1);
        cc.addLast(2);
        cc.addLast(3);
        cc.addLast(4);
        cc.addLast(5);
        cc.addLast(6);
        cc.addLast(7);
        cc.addLast(8);
        cc.createCycle();
        System.out.println(cc.hasCycle());
        cc.cycleRemoval1();
        System.out.println(cc.hasCycle());
        cc.createCycle();
        System.out.println(cc.hasCycle());
        cc.cycleRemoval2();
        System.out.println(cc.hasCycle());
    }
}
