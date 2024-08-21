package AlgorithmicPrograms.Recursion;

import java.io.*;
public class Factorial_Recursion {
    static int factorial(int number){
        if(number==1){
            return 1;
        }else {
            return number*factorial(number-1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(br.readLine());
        int output=factorial(number);
        System.out.println("Factorial of "+number+" is: "+output);
    }
}
