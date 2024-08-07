package Lecture.OOPs.ExceptionHandling;

public class ThrowExceptionExample {
    int sum(int a,int b){
        if(a==0)
            throw new ArithmeticException("Data is invalid");
        else
            System.out.println("Data is Good and Valid");
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        ThrowExceptionExample eg=new ThrowExceptionExample();
        int a=eg.sum(10,20);
        System.out.println(a);
    }
}
