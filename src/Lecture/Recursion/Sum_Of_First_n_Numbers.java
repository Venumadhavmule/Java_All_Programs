package Lecture.Recursion;
import java.util.Scanner;
public class Sum_Of_First_n_Numbers {
    static int sum(int n){
        if(n<1) return 0;
        System.out.println("Present n value: "+n);
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        int output=sum(n);
        System.out.println("Sum "+output);
    }
}
