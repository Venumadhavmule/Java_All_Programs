package AlgorithmicPrograms.Recursion;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner obj1= new Scanner(System.in);
        int number = obj1.nextInt();
        Sum_of_Digits obj = new Sum_of_Digits();
        int sum = obj.add(number);
        System.out.print("Sum: "+sum);
    }
    int add(int n) {
        int sum;
        sum = n % 10;
        if (n == 0) {
            return 0;
        } else {
            return sum + add(n / 10);

        }
    }
}
