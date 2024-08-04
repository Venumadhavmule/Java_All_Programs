package Patterns;

/* code for inverted triangle pattern

**********
 *******
  *****
   ***
    *
        */

import java.util.Scanner;
public class Inverted_Triangular_Star_Pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            //for first spaces
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }

            //for stars print
            for(int j=0;j<2*n - (2*i) -1;j++){
                System.out.print("*");
            }
            //for end space print
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
