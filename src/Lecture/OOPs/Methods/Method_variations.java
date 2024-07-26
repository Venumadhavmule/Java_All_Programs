package Lecture.OOPs.Methods;
import java.util.Arrays;
import java.util.*;

class WRWP{
    double display(double a,double b) {
        System.out.println(a);
        System.out.println(b);
        double c = a+b;
        return c;
    }
}
public class Method_variations {
    public static void main(String[] args) {

        WRWP w = new WRWP();
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double a = obj.nextDouble();
        System.out.print("Enter b value: ");
        double b=obj.nextDouble();
        double d = w.display(a,b);
        System.out.println(d);
    }
}
