package Programs;
import java.util.*;


// Armstrong number -> 153 -> (1*1*1) + (5*5*5) + (3*3*3) = 153
public class ArmstrongNumber {
    public static void main(String [] args) {
        Scanner scObject = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N = scObject.nextInt();
        scObject.close();
        int number = N, reminder, result = 0, num1;
        num1 = number;
        while (number != 0) {
            // take reminder for extract digits value by using modulo operator
            reminder = number % 10;
            result = result + (reminder * reminder * reminder);
            System.out.println("Result value is : "+result);
            //now extract only remaining digits value except already calculated
            number = number / 10;
        }
        if(num1 == result){
            System.out.println("ArmstrongNumber is: "+result);
        }
        else {
            System.out.println("Not an Armstrong Number"+result);
        }
    }
}
