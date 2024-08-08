package Simple_programs;

import java.util.Scanner;
public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1; i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
