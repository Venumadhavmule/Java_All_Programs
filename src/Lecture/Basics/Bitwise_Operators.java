package Lecture.Basics;

public class Bitwise_Operators {
    public static void main(String args[]){
        int a=9 , b=10;
        System.out.println("Bitwise OR operation : "+(a|b));
        System.out.println("Bitwise AND operation : "+(a&b));
        System.out.println("Bitwise XOR operation : "+(a^b));
        System.out.println("Bitwise ~ operation : "+~(a^b));
        System.out.println("Bitwise << operation : "+(a<<1));
        System.out.println("Bitwise << operation : "+(a<<2));
        System.out.println("Bitwise >> operation : "+(a>>1));
        System.out.println("Bitwise >> operation : "+(a>>2));
    }
}
