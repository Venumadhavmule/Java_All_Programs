package Lecture.OOPs;
import java.util.Scanner;

public class BreadAndBreakfast {
    public static int a;
    BreadAndBreakfast(int a){
        System.out.print("A value is: ");
        this.a=a;
    }
}

class Insant{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a= in.nextInt();
        BreadAndBreakfast b=new BreadAndBreakfast(a);
        System.out.println(BreadAndBreakfast.a);
    }
}