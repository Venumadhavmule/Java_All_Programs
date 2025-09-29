package MultiThreading;

public class ThreadExample {
    public static void main(String[] args) {

        // Without Threads
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i: " + i);
//        }
//
//        for (int j = 20; j < 50; j++) {
//            System.out.println("j: " + j);
//        }

        // With Threads

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Task 1 - Number: " + i);
                try {
                    Thread.sleep(500);
                } catch (
                        InterruptedException e
                ) {

                }
            }
        }
        );


        Thread t2 = new Thread(() -> {
            for (char c = 'A'; c<='Z'; c++) {
                System.out.println("Task 2 - Letter: " + c);
                try {
                    Thread.sleep(500);
                } catch (
                        InterruptedException e
                ) {

                }
            }
        });

        t1.start();
//        t1.join(5000, t2);
        t2.start();

    }
}
