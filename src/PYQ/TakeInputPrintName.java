package PYQ;

import java.util.Scanner;

public class TakeInputPrintName {
    public static void main(String[] args) {
        //Scanner class defined
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Name:-");
        String firstName=sc.next(); //scanner sub defined class next we
        //can use with String to taking input to users

        System.out.print("Enter last Name:-");
        String lastName=sc.next();
        System.out.println("Hello\n"+firstName+" "+lastName);

    }
}
