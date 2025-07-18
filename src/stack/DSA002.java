package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class DSA002 {
    public static void main(String[] args) {
        //Stack DSA preparation
        //UnderFlow in stack
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(44);
        st.push(65);
        st.push(64);
        st.push(78);
        System.out.println(st);

        //remove pop
        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);

        //stack exception Handling
        try {
            st.pop();
            System.out.println(st);
        }catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }
    }
}
