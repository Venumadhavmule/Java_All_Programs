package Lecture.Recursion;

import java.util.Scanner;
public class Print_Name_N_times {
    static void printT(int i, int n){
        if(i>n) return;
        System.out.println(i+": Prabhas");
        printT(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        printT(1,n);

    }
}
