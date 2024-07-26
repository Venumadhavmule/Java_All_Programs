package Lecture.OOPs.classs;

class StaticEg{
    static int a;
    static void display(){
        System.out.println("Welcome to static method");
    }
}
public class StaticEg1 {
    public static void main(String[] args) {
        StaticEg.display();
        System.out.println(StaticEg.a);
        StaticEg.a=10;
        System.out.println(StaticEg.a);

    }
}
