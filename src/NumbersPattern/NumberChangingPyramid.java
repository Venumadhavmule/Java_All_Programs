package NumbersPattern;

public class NumberChangingPyramid {
    public static void main(String [] args) {
        int output = 1;
        for(int i = 0; i<=8; i++) {
            for(int j = 0; j<=i ; j++) {
                System.out.print(output+" ");
                output++;
            }
            System.out.println();
        }
    }
}
