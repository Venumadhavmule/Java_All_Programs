package Lecture.OOPs.ExceptionHandling;

/*
Exception
--compile time errors
  1.classNotFound
  2.fileNotFound
--Runtime errors
  1.ArithmeticException
  2.NumberNotFoundException


 */

public class Exception1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("a: "+a+ "\nb: " + b);
        try {
            int c = a / b;
            System.out.println("c: "+c);
        } catch (Exception e) {
            System.out.println("Exception is occured ");
            System.out.println(a + " " + b);

        }

        int p=5_00_000;
        int t=5;
        int r=2;
        try{
            int si=(p*t*r)/0;
            System.out.println(si);
        }catch (ArithmeticException ae){
            System.out.print(ae+" Occured");
        }
    }
}