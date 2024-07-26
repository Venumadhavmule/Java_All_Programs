package Programs.Simple_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        int originalCopy = num;
        int rev =0;
        while(num>0) {
            int rem = num%10;
            rev = rev*10 +rem;
            num = num/10;
        }
        if(rev == originalCopy){
            System.out.println("This is palindrome");
        }else {
            System.out.println("This is not palindrome: ");
        }

    }
}
