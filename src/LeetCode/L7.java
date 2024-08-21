package LeetCode;
import java.util.Scanner;
class Reverse_A_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        System.out.println("Original number is: "+number);
        int revNumber=0;
        while(number!=0){
            int lastDigit=number%10;
            revNumber = (revNumber*10)+lastDigit;
            number=number/10;
        }
        System.out.println("Reverse number is: "+revNumber);
    }
}
