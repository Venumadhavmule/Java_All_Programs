package Programs.Simple_programs;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter year: ");
        int a = obj.nextInt();
        if(a%4==0 && a%100!=0 && a%400 == 0 ) {
            System.out.println(a+" is leap Year.");
        }else {
            System.out.println(a+" is not a leap year.");
        }
    }
}
