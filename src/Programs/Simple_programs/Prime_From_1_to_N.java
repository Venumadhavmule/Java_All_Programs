package Programs.Simple_programs;

public class Prime_From_1_to_N {
    public static void main(String[] args) {
        int n = 18;

        for (int a = 2; a <= n; a++) {
            int count = 0;
            for (int i = 2; i <= a; i++) {
                if (a % i == 0) {
                    count++;

                }

            }
            if (count == 1) {
                System.out.println(a + " is prime number");
            }
        }
    }
}