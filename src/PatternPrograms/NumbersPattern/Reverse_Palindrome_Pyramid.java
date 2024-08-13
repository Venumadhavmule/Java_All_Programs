package PatternPrograms.NumbersPattern;
/*program for

Enter N value: 6
65432123456
 543212345
  4321234
   32123
    212
     1

 */
import java.util.*;
public class Reverse_Palindrome_Pyramid {
    public static void main(String[] args) {

        Scanner ref= new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n= ref.nextInt();

        //Outer Loop
        for(int i=0;i<n;i++){

            //loop for spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //for number print
            int present=n-i; //present n value
            int breakPoint= ((n-i)*2-1)/2; //break point for condition
            int iterations=((n-i)*2-1); //no of iterations for print number arrangement
            for(int j=0;j<iterations;j++){
                System.out.print(present+"");
                if(j<breakPoint){
                    present--;
                }else {
                    present++;
                }
            }
            System.out.println();
        }
    }
}
