package Lecture.Recursion;
import java.util.Scanner;
public class Print_1_To_N {
    static void print(int i, int n){
        if(i>n) return;
        System.out.println(i);
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Staring value: ");
        int start=sc.nextInt();
        System.out.print("Enter last value: ");
        int last=sc.nextInt();
        print(start,last);
    }
}
