package NumbersPattern;

public class NumbersIncreasingReversePyramid {
    public static void main(String [] args) {
        for(int i = 0; i <= 5; i++){
            for(int j = 1; j<=5-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
