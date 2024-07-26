package Lecture.OOPs.ExceptionHandling;

public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("a: "+a+ "\nb: " + b);
        try {
            int c = a / b;
            System.out.println("c: "+c);
        } catch (java.lang.Exception e) {
            System.out.println("Exception is occured ");
            System.out.println(a + " " + b);

        }
    }
}