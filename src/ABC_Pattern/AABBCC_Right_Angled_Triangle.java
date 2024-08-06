package ABC_Pattern;
/* program for
   A
   B B
   C C C
   D D D D
   E E E E E

 */
public class AABBCC_Right_Angled_Triangle {
    public static void main(String args[]){
        for(int i=0; i<5; i++){

            for(int j=0;j<=i;j++){
                char ch=(char)('A'+i);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
