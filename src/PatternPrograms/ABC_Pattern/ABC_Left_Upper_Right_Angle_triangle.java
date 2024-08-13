package PatternPrograms.ABC_Pattern;
/* program for
    A B C D E
    A B C D
    A B C
    A B
    A

 */
public class ABC_Left_Upper_Right_Angle_triangle {
    public static void main(String arg[]){
        for(int i=0; i<5;i++){
            for(char ch='A'; ch<='A'+(5-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
