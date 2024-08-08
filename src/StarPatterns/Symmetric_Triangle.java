package StarPatterns;
/* program print the following symmetric pattern
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
*/

public class Symmetric_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=2*n-1;i++){

            //take starting value
            int start=i;

            //update loop start value if it exceeds n value

            if(i>n) start=2*n -i;
            for(int j=1; j<=start;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
