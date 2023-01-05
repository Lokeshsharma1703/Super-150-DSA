package Lec29;

public class Add_Two_Polynomials1634 {
    class PolyNode{
        int coefficient;
        int power;
        PolyNode next;

    }
    public static void main(String[] args) {
        int[][] poly1 = {{2,2}, {4,1}, {3,0}};
        int[][] poly2 = {{3,2}, {-4,1}, {-1,0}};
    }
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2)  {
        PolyNode dummy = new PolyNode();
        PolyNode res = dummy;
        while(poly1!=null && poly2!=null){
            if(poly1.power== poly2.power){
                if(poly1.coefficient+ poly2.coefficient!=0){
                    PolyNode node = new PolyNode();
                    node.coefficient = poly1.coefficient+ poly2.coefficient;
                    node.power = poly1.power;
                    dummy.next = node;
                    dummy = dummy.next;
                }
                poly1 = poly1.next;
                poly2 = poly2.next;
            }
            else if(poly1.power> poly2.power){
                PolyNode node = new PolyNode();
                node.coefficient = poly1.coefficient;
                node.power = poly1.power;
                dummy.next = node;
                dummy = dummy.next;
                poly1 = poly1.next;
            }
            else{
                PolyNode node = new PolyNode();
                node.coefficient = poly2.coefficient;
                node.power = poly2.power;
                dummy.next = node;
                dummy = dummy.next;
                poly2 = poly2.next;
            }
        }
        if(poly1!=null){
            dummy.next = poly1;
        }
        if(poly2!=null){
            dummy.next = poly2;
        }
        return res.next;
    }
}
