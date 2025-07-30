package PYQ01;

public class SwapValueProgramme {
    public static void main(String[] args) {
        //Creating java swap value programme
        int a=34;
        int b=56;

        System.out.println("Before swaping a :-"+a);
        System.out.println("Before swaping b :-"+b);
        //swaping value here.....
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("Resulted value of b is:-"+temp);
        System.out.println("After Swaping a :-"+a);
        System.out.println("After Swaping a :-"+b);
    }
}
