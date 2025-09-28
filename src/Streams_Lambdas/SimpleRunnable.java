package Streams_Lambdas;

public class SimpleRunnable {
    public static void main(String[] args) {

//      Simple Runnable Example

        Runnable r = () -> System.out.println("Venu");
        new Thread(r).start();


    }
}
