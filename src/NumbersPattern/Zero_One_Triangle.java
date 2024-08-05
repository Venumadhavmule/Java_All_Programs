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

        System.out.println("\nSecond method: ");
        int start=1;
        for(int i=0;i<6;i++){
            if(i%2==0){
                start=1;
            }else {
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
