package Lec29;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int item){
        this.val = item;
        this.next = null;
    }
}

public class LinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;

    public void addFirst(int item){
        ListNode node = new ListNode(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int item){
        ListNode node = new ListNode(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtPos(int item, int pos) throws Exception{
        if(pos<0 || pos>size){
            throw new Exception("index out of range");
        }
        if(pos==0){
            addFirst(item);
        }
        else if(pos==size){
            addLast(item);
        }
        else{
            ListNode kth = getNode(pos-1);
            ListNode node  = new ListNode(item);
            node.next = kth.next;
            kth.next = node;
            size++;
        }
    }

    private ListNode getNode(int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("index out of range");
        }
        ListNode temp = head;
        for(int i=1;i<=k;i++){
            temp = temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.val;
    }

    public int getLast(){
        return tail.val;
    }

    public int getIndex(int k) throws Exception{
        return getNode(k).val;
    }

    public int removeFirst() throws Exception{
        if(size<1){
            throw new Exception("LinkedList is empty");
        }
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        int n = head.val;
        head = head.next;
        size--;
        return n;
    }

    public int removeLast()throws Exception{
        if(size<1){
            throw new Exception("LinkedList is empty");
        }
        if(size==1){
            return removeFirst();
        }
        else{
            ListNode ss = getNode(size-2);
            int n = tail.val;
            tail = ss;
            tail.next = null;
            size--;
            return n;
        }
    }

    public int removeAtIndex(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("index out of range");
        }
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            ListNode prev = getNode(k-1);
            ListNode curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }

    public int getSize(){
        return size;
    }

    public void display(){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void createCycle() throws Exception{
        tail.next = getNode(2);
    }
    public ListNode getHead(){
        return head;
    }

    public boolean hasCycle() {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public ListNode MeetingPoint() {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return slow;
            }
        }
        return null;
    }

    public void cycleRemoval1(){
        ListNode meet = MeetingPoint();
        if(meet==null){
            return;
        }

        ListNode temp = meet;
        int count = 1;
        while(temp.next!=meet){
            temp = temp.next;
            count++;
        }

        ListNode fast = head;

        for(int i=1;i<=count;i++){
            fast = fast.next;
        }

        ListNode slow = head;
        while (slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public void cycleRemoval2(){
        ListNode meet = MeetingPoint();
        if(meet==null){
            return;
        }

        ListNode fast = meet;
        ListNode slow = head;

        while (slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

}
