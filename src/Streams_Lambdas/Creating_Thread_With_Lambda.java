package Streams_Lambdas;

public class Creating_Thread_With_Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread with Lambda!")).start();
    }
}
