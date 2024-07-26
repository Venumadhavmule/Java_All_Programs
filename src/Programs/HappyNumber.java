package Programs;

public class HappyNumber {
    public static void main(String [] args) {
            int num  = 23 ;
            int sum = 0;
            int rem;

            do{
                sum = 0;
                while(num > 0) {
                    rem = num % 10;
                    sum = sum + (rem * rem);
                    num = num / 10;
                }
                num = sum;
            }while (num>5);

            if(num == 1){
                System.out.println("This is a happy number");
            } else{
                System.out.print("This is a unhappy number");
            }
    }
}
