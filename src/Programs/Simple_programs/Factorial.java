package Programs.Simple_programs;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int orig=n;
        int factNum=1;
        while(n>=1){
            factNum *=n;
            n--;

        }
        System.out.println("Factorial number of "+orig+" = "+factNum);
    }
}
