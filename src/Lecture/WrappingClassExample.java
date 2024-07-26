package Lecture;



public class WrappingClassExample {
    public static void main(String args [] ) {

        //Boxing
        int a = 10;
        System.out.println("a value: "+a);
        Integer i = Integer.valueOf(a);
        System.out.println("i value: "+i);
        int k = i;
        System.out.println("k value: "+k);

        //Unboxing
        Integer v = Integer.valueOf(3);
        System.out.println("v value: "+v);
        int b = v.intValue();
        System.out.println("b value: "+b);

    }
}
