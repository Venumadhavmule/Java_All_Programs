package Simple_programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Extracting_digits_data {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = obj.nextInt();
    int m = num;
    int count = 0;
    while(num>0) {
        num=num/10;
        count++;
    }
    while (m>0) {
        int rem = m%10;
        System.out.println("The digit at position: "+count+" is:"+rem);
        m=m/10;
        count--;
    }

    {

    }
}

}
