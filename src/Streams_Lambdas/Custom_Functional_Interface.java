package Streams_Lambdas;


//    @FunctionalInterface

public class Custom_Functional_Interface {
    public static void main(String args[]) {

        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                System.out.println("Addition: "+(a+b));
                return a+b;
            }
        };

            Calculator multiply = (a, b) -> {
                System.out.println("Multiply: "+(a*b));
                return a * b;
            };

            Calculator subtraction = (a, b) -> a - b;
            Calculator division = (a, b) -> {
                if(b == 0) throw new ArithmeticException("Cannot divided by 0");

                return a / b;
            };

            add.calculate(22,769);
            multiply.calculate(567,694);
        System.out.println("Division: "+division.calculate(33673,55));



    }

}