package Lec24;

public class Dynamic_Stack_Client {
    public static void main(String[] args) throws Exception {
        Dynamic_Stack st = new Dynamic_Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.push(60);
        st.push(70);
        st.display();
    }
}
