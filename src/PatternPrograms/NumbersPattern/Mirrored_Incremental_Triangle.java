package PatternPrograms.NumbersPattern;
/*program for this pattern
        1      1
        12    21
        123  321
        12344321

 */
public class Mirrored_Incremental_Triangle {
    public static void main(String[] args) {
        for(int i=1; i<=4;i++){

            //1.loop for first triangle
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //2. loop for spaces
            for(int j=1;j<=4*2-(2*i);j++){
                System.out.print(" ");
            }

            //3.loop for last triangle
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
