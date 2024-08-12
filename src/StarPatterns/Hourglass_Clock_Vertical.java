package StarPatterns;
/* program for

Enter n value: 6
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

By using Second Method

*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

 */
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Hourglass_Clock_Vertical {
    public static void main(String[] args) {
        System.out.print("Enter n value: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int spaces=(n*2)-2;
        //Upper part pattern
        for(int i=0;i<n;i++){
            //for first Stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            spaces -=2;
            // for Second pattern
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

          spaces +=4;
          //Lower Part
        for(int i=0;i<n-1;i++){
           //for first starts
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
           //for Spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            spaces+=2;

           //for Second pattern
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nBy using Second Method\n");
        int sSpaces=2*n-2;
        ////2nd Method
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1;j<=sSpaces;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n) sSpaces -=2;
            else sSpaces +=2;
            System.out.println();
        }

    }
}
