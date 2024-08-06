package ABC_Pattern;
/* program for
   A
   B B
   C C C
   D D D D
   E E E E E

 */
public class ABBCCC_Right_Angled_Triangle {
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            char ch=(char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
