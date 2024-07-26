package Programs.Simple_programs;

import java.util.Scanner;

public class Sum_Even_Odd {
    public static void main(String args[]) {
        int sumE =0 ,sumO=0;
        System.out.print("Enter number count: ");
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int a[] = new int[n];
        //String s[] = new String[];
        for(int i= 0; i<n ; i++) {
            a[i]= obj.nextInt();
        }
        for(int i=0; i<a.length;i++) {
            if(a[i]%2 == 0){
                sumE = sumE+a[i];
            }else {
                sumO = sumO+a[i];
            }
        }
        System.out.println("Sum of Even numbers: "+sumE+"\nSum of Odd numbers: "+sumO);
    }
}
