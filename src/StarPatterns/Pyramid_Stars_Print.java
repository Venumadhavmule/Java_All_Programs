package StarPatterns;

/* Program for following pattern
    *
   ***
  *****
 *******
*********

*/

import java.util.Scanner;
public class Pyramid_Stars_Print{
    public static void main(String[] args) {
        Scanner ref= new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n= ref.nextInt();
        //For loop for outer loop
        for(int i=0; i<n; i++){
            //This for loop for first spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1 ; j++){
                System.out.print("*");
            }

            // This for loop for last spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
