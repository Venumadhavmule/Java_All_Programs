public class Main {
    static int c;
    public static void add(int a, int b){
        c= a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        add(10,20) ;
        System.out.println(c);
    }
}