package PatternPrograms.ABC_Pattern;
/* program for
    A
    A B
    A B C
    A B C D
    A B C D E

 */

public class ABC_Right_Angled_triangle {
    public static void main(String[] args) {
        //outer loop for number of rows
        for(int i=0;i<5; i++){

            // Inner loop will loop for i times and
            // print alphabets from A to A + i.  i.e-> A,B,C
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
