package Patterns;

public class MirrorDiagonalPattern {
    public static void main(String [] args) {
        for (int i = 0; i<=5; i++) {
            for(int j=1; j<= 5-i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
