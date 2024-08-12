package StarPatterns;
/* program for
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */

public class Diamond_Surrounded_Stars {
    public static void main(String args[]){
        int spaces=0;
        //1.... for upper part
        for(int i=0;i<5;i++){
            //for first stars
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            spaces+=2;

            //for 2nd Stars
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2... for lower part
        for(int i=0;i<5;i++){
            //for first star part
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            //for spaces
            spaces-=2;
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }


            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
