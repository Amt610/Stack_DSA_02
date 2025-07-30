package PYQ01;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        //Create java Average Calculation programme
        Scanner sc=new Scanner(System.in);

        //first Number input
        System.out.print("Enter first Number:-");
        int num1=sc.nextInt();

        //second Number input
        System.out.print("Enter Second Number:-");
        int num2=sc.nextInt();

        //third Number input
        System.out.print("Enter third Number:-");
        int num3=sc.nextInt();

        //fourth Number Input
        System.out.print("Enter fourth Number:-");
        int num4=sc.nextInt();

        int Average_Value=num1+num2+num3+num4;
        int Average=Average_Value/4;

        System.out.println("Average Value is:-"+Average);
    }
}
