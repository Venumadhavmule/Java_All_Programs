package Patterns;

import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String args[]){
        int i,j;
        System.out.print("Enter n value: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        //for upper part
        for (i=1; i<=n; i++) {
            //print spaces for upper upper part
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //print Stars for upper part
            for(j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        //for lower part
        for(i=1; i<=n-1; i++){
            //print spaces for lower part
            for(j=1; j<=i;j++){
                System.out.print(" ");
            }

            //print stars for lower
            for(j=1;j<=n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
