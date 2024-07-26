package Lecture.OOPs.Methods;

import java.util.Arrays;

import static java.lang.Long.sum;

class NRWP {
    void sum(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
        int c= a+b;
        System.out.println(c);
    }
}
public class Example {
    void sum1(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        NRWP w = new NRWP();
       w.sum(20,10);

       Example w1 = new Example();
       w1.sum1(200,100);
    }
}
