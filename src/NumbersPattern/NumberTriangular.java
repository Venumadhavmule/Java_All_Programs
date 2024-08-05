package NumbersPattern;
/*program for
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5

 */
public class NumberTriangular {
    public static void main( String[] args) {
        for (int i = 1; i<= 5; i++){

            //this loop for print spaces for pyramid construction
            for(int j = 0; j < 5-i; j++){
                System.out.print(" ");
            }

            //this loop for print iterative number pyramid
            for(int n = 1; n<=i; n++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
