public class Main {
    static int c;
    public static int add(int a, int b){
        c= a+b;
        System.out.println(c);
        return c*10;
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        int p=add(10,20) ;
        System.out.println(p);
        System.out.println(c);
    }
}