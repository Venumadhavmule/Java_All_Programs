package Programs.Simple_programs;

// Fibonacci series means Addition of nextvalue= present number + previous number
public class Fibonacci_Series {
    public static void main(String[] args) {
        int count=10;
        //first number
        int n1=0;
        //second number
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        for (int i=2; i<count; i++){
            //next number = present number(n2)+previous number(n1);
            int n3=n1+n2;
            System.out.print(n3+" ");
            //changing n1 & n2 values
            n1=n2;
            n2= n3;

        }
    }
}
