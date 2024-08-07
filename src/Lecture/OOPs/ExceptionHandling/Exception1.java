package Lecture.OOPs.ExceptionHandling;

/*

Exception
--compile time errors(Checked Exceptions)
  1.classNotFound
  2.fileNotFound
--Runtime errors (Unchecked Exceptions)
  1.ArithmeticException
  2.NumberNotFoundException
  3.LogicalException(identify By debugging)

 */

public class Exception1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("a: "+a+ "\nb: " + b);
        try {
            int c = a / b;
            System.out.println("c: "+c);
        } catch (Exception e) {
            System.out.println("Exception is occured ");
            System.out.println(a + " " + b);

        }

        int p=5_00_000;
        int t=5;
        int r=2;

        //try & catch & finally only
        System.out.println("This is from Try & catch & finally blocks");
        try{
            int si=(p*t*r)/0;
            System.out.println("Simple interest : "+si);
        }catch (ArithmeticException ae){
            System.out.print(ae+" Occured");
        }finally {
            System.out.print("Finally block is Excecuted");
        }

        //try & finally
        System.out.println("This is from Try & final blocks");
        try{
            int si=(p*t*r)/10;
            System.out.println("Simple interest : "+si);
        }finally {
            System.out.print("Finally block is Excecuted");
        }


    }
}