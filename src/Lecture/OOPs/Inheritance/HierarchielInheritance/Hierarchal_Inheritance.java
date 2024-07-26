package Lecture.OOPs.Inheritance.HierarchielInheritance;

class A{
    int a=200;
    int b= 100;
}
class B extends A{
    int c;
    void add(){
        c=a+b;
    }
}
class C extends A{
    int c;
    void sub(){
        c=a-b;
    }
}

class D extends A{
    int c;
    void mul(){
        c=a*b;
    }
    public static void main(String args[]){
        B b=new B();
        C c=new C();
        D d=new D();
        b.add();
        c.sub();
        d.mul();
        System.out.println(b.c);
        System.out.println(c.c);
        System.out.println(d.c);
    }
}