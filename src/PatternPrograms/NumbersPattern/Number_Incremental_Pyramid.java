package PatternPrograms.NumbersPattern;
/*program for
           1
          2 3
         4 5 6
        7 8 9 10
 */
public class Number_Incremental_Pyramid {
    public static void main(String[] args) {
        int num=1;

        //for outer loop
        for(int i=0;i<4;i++){

            //loop for spaces
            for(int j=0;j<4-i-1;j++){
                System.out.print(" ");
            }

            //loop for numbers print
            for(int j=0;j<i+1;j++){
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }
}
