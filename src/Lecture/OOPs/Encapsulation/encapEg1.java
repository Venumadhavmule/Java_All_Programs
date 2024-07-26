package Lecture.OOPs.Encapsulation;

class EncapEg{
    int a=200;
    int b=100;
    void display(){
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
        c=a*b;
        System.out.println(a+"*"+b+"="+c);
        c=a/b;
        System.out.println(a+"/"+b+"="+c);
        c=a-b;
        System.out.println(a+"-"+b+"="+c);
    }
}
public class encapEg1{
    public static void main(String args[]){
        EncapEg e=new EncapEg();
        e.display();
    }
}
