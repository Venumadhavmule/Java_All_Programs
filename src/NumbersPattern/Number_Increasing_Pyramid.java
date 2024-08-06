package NumbersPattern;
/*program for
        ___1
        __2 3
        _4 5 6
        7 8 9 10
 */
public class Number_Increasing_Pyramid {
    public static void main(String[] args) {
        int num=1;
        for(int i=0;i<4;i++){

            //loop for spaces
            for(int j=0;j<4-i-1;j++){
                System.out.print("_");
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
