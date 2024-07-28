package Patterns;

/* Program for following pattern
    *
   ***
  *****
 *******
*********

*/
public class Triangular_Star_Pattern {
    public static void main(String[] args) {
        //For loop for outer loop
        for(int i=0; i<5; i++){
            //This for loop for first spaces
            for(int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1 ; j++){
                System.out.print("*");
            }

            // This for loop for last spaces
            for(int j=0; j<5-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
