package Lecture.OOPs.Inheritance.HybridIneritance;

//Hybrid Inheritance :- Combination of more than one inheritance
class A{
    int a=200;
    int b= 100;
}
class B extends A {
    int c=156;
    void add(){
        c=a+b;
        System.out.println("Add:"+c);
    }
}
class C extends A {
    int c;
    void sub(){
        c=a-b;
        System.out.println("Sub: "+c);
    }
}

class D extends B {
    int c=super.c;
    void display(){
        System.out.println("C value: "+c);
    }
    void mul(){
        c=a*b;
        System.out.println("Mul:"+super.c);
    }
    public static void main(String args[]){
        C c=new C();
        D d=new D();
        d.display();
        d.add();
        c.sub();
        d.mul();
    }
}