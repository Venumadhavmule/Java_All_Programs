package Lecture.OOPs.classs;
class ThisEg{
    int a ;
    int b ;
    void sum(int a, int b){
        this.a = a;
        this.b  =b;
        int c = a+b;
        System.out.println("c: "+c);

    }
    void show(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
public class ThisEg1 {
    public static void main(String[] args) {
        ThisEg eg = new ThisEg();
        eg.show();
        System.out.println("Passing values to method ");
        eg.sum(40,30);
        System.out.println("After pass values:");
        eg.show();
    }

}
