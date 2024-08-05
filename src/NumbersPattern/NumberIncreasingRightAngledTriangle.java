package NumbersPattern;

/*This program is for print the NumberIncreasing Pyramid
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

 */
import java.util.Scanner;
public class NumberIncreasingRightAngledTriangle {

    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=s.nextInt();
        for( int i = 0; i < n ; i++){
            for(int j= 1; j<= i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
