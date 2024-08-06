package NumbersPattern;

import java.util.Scanner;
public class PalindromeTriangular {
    public static void main(String args[]){
//        Scanner ref= new Scanner(System.in);
//        System.out.print("Enter N value: ");
//        int n= ref.nextInt();
        for(int i=0;i<5;i++){
            //loop for first spaces
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }

            //loop for pattern
            for(int j=0; j<2*i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
