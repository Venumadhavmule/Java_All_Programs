package Simple_programs;

import java.util.Scanner;

public class Divisible_By_5 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = obj.nextInt();
        if(number%5==0) {
            System.out.println(number+" is divisible by 5");
        }else {
            System.out.println(number+" is not divisible by 5");
        }
    }
}
