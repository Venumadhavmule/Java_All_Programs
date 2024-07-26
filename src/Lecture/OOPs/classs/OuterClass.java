package Lecture.OOPs.classs;

public class OuterClass{
    private String outerField="Outer field";

    //Member Inner Class
    class InnerClass{
        void display(){
            System.out.println("Accessing: "+outerField);
        }
    }

    //Static inner Class
    private static String staticOuterField="Static outer filed";
    static class StaticNestedClass{
        void show(){
            System.out.println("Accessing: "+staticOuterField);
        }
    }

    //Local inner Class
    void outerMethod(){
        final String localVariable="Local variable";
        class LocalInnerClass{
            void display(){
                System.out.println("Accessing: "+localVariable);
            }
        }

        LocalInnerClass localInner=new LocalInnerClass();
        localInner.display();
    }
    public static void main(String args[]){
        //Member Class Object and accesing
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.display();

        //Static class accessing
        OuterClass.StaticNestedClass nested=new OuterClass.StaticNestedClass();
        nested.show();

        //Local inner class object
        outer.outerMethod();
    }
}
