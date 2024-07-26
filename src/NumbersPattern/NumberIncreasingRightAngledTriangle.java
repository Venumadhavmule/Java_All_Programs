package NumbersPattern;

//This program is for print the NumberIncreasing Pyramid
public class NumberIncreasingRightAngledTriangle {

    public static void main(String [] args) {
        for( int i = 0; i < 5 ; i++){
            for(int j= 1; j<= i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
