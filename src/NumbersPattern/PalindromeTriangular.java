package NumbersPattern;

/*
     1
    212
   32123
  4321234
 543212345
65432123456

 */
import java.util.Scanner;
public class PalindromeTriangular {
    public static void main(String args[]){
        Scanner ref= new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n= ref.nextInt();
        for(int i=0;i<n;i++){
            //loop for first spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            int breakpoint=(2*i+1)/2;
            int present=i+1;
            //loop for pattern
            for(int j=0; j<2*i+1; j++){
                System.out.print(present);
                if(j<breakpoint){
                    present--;
                }else {
                    present++;
                }
            }
            System.out.println();
        }
    }
}
