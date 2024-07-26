package Programs.Simple_programs;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n= obj.nextInt();
        if(n%2==0) {
            System.out.println(n+" is Even number");
        }
        else {
            System.out.println(n+" is Odd Number");
        }
    }
}
