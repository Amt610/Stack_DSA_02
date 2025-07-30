package PYQ01;

public class SwapMethod02 {
    public static void main(String[] args) {
        int a=23;
        int b=54;
        System.out.println("Before swaping value a is:-"+a);
        System.out.println("Before swaping value b is:-"+b);
        //Before swaping result value is
        a=a+b;
        b=a-b;
        a=a-b;

        //After Swaping result value is
        System.out.println("After swaping value a is:-"+a);
        System.out.println("After swaping value b is:-"+b);
    }
}
