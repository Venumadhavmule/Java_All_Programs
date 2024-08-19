package Simple_programs;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number:");
        int Number=s.nextInt();
        int count=0;
        int numberDup=Number;
        System.out.print("No of digits in "+Number+" is : ");
        while(Number>0){
            count++;
            Number=Number/10;
        }
        System.out.print(count);

        System.out.println("----> 2.Count digits By using log method.");
        count=(int)(Math.log10(numberDup)+1);
        System.out.println("No of digits in "+numberDup+" is : "+count);
    }
}
