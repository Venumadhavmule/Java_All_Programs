package Simple_programs;

public class Prime_From_1_to_N {
    public static void main(String[] args) {
        int n = 18;
        System.out.println("Prime numbers from "+1+" to "+n);

        for (int a = 2; a <= n; a++) {
            //create count value fresh to every number
            int count = 0;
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    //Count the value if present number is divisible by inner loop
                    count++;
                }

            }
            //print the present number as prime if only count value is 1
            if (count == 1) {
                System.out.print(a+" ");
            }
        }
    }
}