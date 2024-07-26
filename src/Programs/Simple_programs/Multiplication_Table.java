package Programs.Simple_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication_Table{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = obj.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
