package Simple_programs;
import java.util.Scanner;
public class Positive_or_Negative {
    public static void main(String args []) {
        System.out.print("Enter a number: ");
        Scanner obj= new Scanner(System.in);
        int number = obj.nextInt();
        if(number>0) {
            System.out.println(number+" is positive number");
        }else if (number<0) {
            System.out.println(number+" is negative number");
        }else{
            System.out.println(number+" is neither negative nor positive");
        }
    }
}
