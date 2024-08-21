package Lecture.Recursion;

/*
Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

It makes the code compact but complex to understand.
 */
public class Recursion {
   static int count=0;
    static void print(){

        if(count==3) return;
        System.out.println(count);
        count += 1;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}

