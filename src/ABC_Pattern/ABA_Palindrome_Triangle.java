package ABC_Pattern;
/*program for
_ _ _ _ A _ _ _ _
_ _ _ A B A _ _ _
_ _ A B C B A _ _
_ A B C D C B A _
A B C D E D C B A

 */
public class ABA_Palindrome_Triangle {
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){

            //loop for first spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("_ ");
            }

            //for middle palindrome pattern
            int breakPoint = (2*i+1)/2;
            char ch='A';
            for(int j=1; j<=(2*i)+1; j++){
                System.out.print(ch+" ");
                if(j<=breakPoint){
                    ch++;
                }else {
                    ch--;
                }
            }

            //loop for last spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("_ ");
            }
            System.out.println();
        }

    }
}
