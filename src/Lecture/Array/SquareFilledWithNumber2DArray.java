package Lecture.Array;

public class SquareFilledWithNumber2DArray {
    public static void main(String args[]) {
        int value = 1;
        int a[][] = new int[3][3];
        for(int i = 0; i< 3; i++) {
            for(int j = 0; j<3;j++){
                a[i][j] = value;
                value++;
            }
        }
        for(int i = 0; i<3; i++){
            for(int j= 0; j<3; j++) {
                System.out.print("a["+i+"]["+j+"]:"+a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
