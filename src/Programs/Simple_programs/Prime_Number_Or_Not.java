package Programs.Simple_programs;

public class Prime_Number_Or_Not {
    public static void main(String[] args) {
        int n=18;
        int count=0;
        for(int i=2; i<=n;i++){
            if(n%i==0){
                count++;

            }
            if(count>1){
                System.out.println(n+" is not a prime number");
                break;
            }
        }
        if(count==1){
            System.out.println(n+" is prime number");
        }
    }
}
