package stack;

public class DSA003 {

    //create stack class
    public static class stack{
        int[] arr=new int[10];//create Array

        int idx=0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }

        int pop(){
            if (idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        int peek(){
            if (idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        void display(){

        }
    }
    public static void main(String[] args) {
        //create own Stack list
        stack st=new stack();
        st.push(23);
        st.push(44);
        st.push(54);
        st.push(64);

        for (int i = 0; i < 4; i++) {
            System.out.println(st[i]);
        }
    }
}
