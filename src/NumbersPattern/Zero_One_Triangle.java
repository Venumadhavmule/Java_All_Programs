package NumbersPattern;

public class Zero_One_Triangle {
    public static void main(String [] args) {
        for(int i = 1; i<=4; i++) {
            for(int j=1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
