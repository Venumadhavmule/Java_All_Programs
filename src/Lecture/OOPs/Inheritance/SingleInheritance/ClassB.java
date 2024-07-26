package Lecture.OOPs.Inheritance.SingleInheritance;

class A{
    int a;
    int b;
    void display(){
        System.out.println(a);
        System.out.println("This is display method in A class");
    }
    void sum(int a, int b){
        System.out.println("Class A ");
        int c=a+b;
        System.out.println("Sum of a and b "+c);
    }
    A(){
        System.out.println("This is A Constructor");
    }
}

class B extends A {

    B(){
        super();
        System.out.println("This is B Class Constructor");
    }
    void display(){
        super.display();
//        System.out.println("Display method in Class B");
    }

    void show(){
        a=90;
        b=20;
        int c=a+b;
        System.out.println(c);
    }
    void sum(int a, int b){
        System.out.println("This is child class sum method");
        super.sum(a,b);
    }

    public static void main(String[] args) {
        B b= new B();
//        b.display();
        b.show();
        b.display();
        b.sum(10,20);
    }
}
