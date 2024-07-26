package Lecture.OOPs.Constructor;


//method overloading, multiple methods can have the same name with different parameters:
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
class Construct{
    int a;

    //Default constructor
    Construct(){
        System.out.println("1.Default Constructor invoked");
        a=10;
        System.out.println("value of a: "+a);
    }

    // Parameterised constructor
    Construct (String str){
        System.out.println("2.Parametrized Constructor invoked: ");
        System.out.println("Vegetables: " + str);
    }

    //Parameterized constructor
    Construct(int a, int b){
        System.out.println("3.Parameterized constructor invoked: ");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(a+b);
    }
}


public class ConstructorExample {
    public static void main(String[] args) {
        Construct c1= new Construct();
        Construct c2 = new Construct("Cauliflower");
        Construct c3 = new Construct(20,56);
        Construct c4 = new Construct("Hii");
        Construct c5 = new Construct(89,11);
    }
}
