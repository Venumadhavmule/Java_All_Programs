package Streams_Lambdas;

public class Custom_Functional_Interface {

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = ((a, b) -> a * b);
        Calculator subtraction = ((a, b) -> a - b);

        System.out.println("Addition: " + add.calculate(2, 5));
        System.out.println("Multiplication: " + multiply.calculate(2, 6));
        System.out.println("Subtraction: " + subtraction.calculate(50, 22));
    }
}
