package Simple_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_integers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 =obj.nextInt();
        System.out.print("Enter second number: ");
        int number2 = obj.nextInt();
        if(number1 == number2) {
            System.out.println(number1+" and "+number2+ " are equal.");
        }else {
            System.out.println(number1+" and "+number2+ " are not equal.");
        }
    }
}
