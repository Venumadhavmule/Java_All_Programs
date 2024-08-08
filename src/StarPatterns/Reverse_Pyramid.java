package StarPatterns;
/*program for

*****************
 ***************
  *************
   ***********
    *********
     *******
      *****
       ***
        *

 */
import java.util.Scanner;
public class Reverse_Pyramid {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=ref.nextInt(); // Number of rows for the pyramid
        for(int i=0;i<n;i++){

            // Print leading spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            // Print stars
            for(int j=0;j<(n*2-i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
