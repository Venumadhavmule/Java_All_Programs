package Patterns;
/* program for
StaggeredRectangle pattern:
* * * *
 * * * *
  * * * *
   * * * *
Reverse StaggeredRectangle pattern
   * * * *
  * * * *
 * * * *
* * * *

 */
public class StaggeredRectangle {
    public static void main(String args []){

        System.out.println("StaggeredRectangle pattern:");
        for(int i = 0;i<4; i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Reverse StaggeredRectangle pattern");
        for(int i=1; i<=4;i++){
            for(int j=1; j<=4-i ; j++) {
                System.out.print(" ");
            }
            for(int j=1 ; j<= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
