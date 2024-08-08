package Simple_programs;

import java.util.Scanner;

public class Sum_Of_Digits_in_Number {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int sum = 0;
        while(number>0){
            //for get last digit by reminder
            int rem = number%10;
            sum = sum+rem;
            //for get quotient number
            number = number/10;
        }
        System.out.println("Sum of digits in "+number+" is: "+sum);
    }
}
