package NumbersPattern;
/* program for
Enter n value: 5

555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555

 */

import java.util.Scanner;
import static java.lang.Math.min;
public class Concentric_Square_Pattern {
    public static void main(String[] args) {
        System.out.print("Enter n value: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i=0;i<(2*n)-1;i++){
            for(int j=0; j<(2*n)-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom = (2*n-2)-i;
                System.out.print(n-min(min(top,bottom),min(left,right)));
            }
            System.out.println();
        }
    }
}
