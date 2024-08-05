package NumbersPattern;
/* program for
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21

 */
import java.util.Scanner;

public class NumberChangingPyramid {
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=s.nextInt();
        int output = 1;
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=i ; j++) {
                System.out.print(output+" ");
                output++;
            }
            System.out.println();
        }
    }
}
