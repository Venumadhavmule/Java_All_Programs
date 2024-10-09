package AlgorithmicPrograms;

//Swapping of two numbers without using 3Rd variable
public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping\n a :"+a+" b :"+b);
        //System.exit(0);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping\n a :"+a+" b :"+b);
    }
}
