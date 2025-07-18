package stack;

import java.util.Scanner;
import java.util.Stack;

public class DSA001 {
    public static void main(String[] args) {
        //this is java stack full course

        //take input
        Scanner sc=new Scanner(System.in);

        //Stack length
        System.out.print("Enter the length of Array:-");
        int n= sc.nextInt();

        Stack<Integer> st=new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Array Element:-");
            int x=sc.nextInt();
            st.push(x);
        }

        //stack list element
        System.out.println("Stack Element:-"+st);

        //Stack list
        Stack<Integer> rt=new Stack<Integer>();
        while (st.size()>0){
            rt.push(st.pop());
        }

        System.out.println("Stack Element T:-"+rt);

        //transfer all rt stack element in stack
        while (rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println("Stack Element R:-"+st);
    }
}
