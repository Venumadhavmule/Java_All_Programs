package Simple_programs;

import java.util.Scanner;

public class Largest_among_Three {
    public static void main(String args[]) {
        System.out.print("Enter first number: ");
        Scanner obj = new Scanner(System.in);
        int number1 = obj.nextInt();
        System.out.print("Enter second number: ");
        int number2 = obj.nextInt();
        System.out.print("Enter third number: ");
        int number3 = obj.nextInt();
        if (number1 > number2 && number1 > number2) {
            System.out.println(number1 + " is greater than " + number2 + " and " + number3);
        }else if(number2>number3 ){
            System.out.println(number2 + " is greater than " + number1 + " and " + number3);
        }else {
            System.out.println(number3 + " is greater than " + number1 + " and " + number2);
        }
    }
}
