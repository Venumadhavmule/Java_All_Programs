package Simple_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = obj.nextInt();
        int revNum = 0;
        while(num>0) {
            int rem = num%10;
            revNum = revNum*10 + rem;
            num = num/10;
        }
        System.out.println(revNum);

    }
}
