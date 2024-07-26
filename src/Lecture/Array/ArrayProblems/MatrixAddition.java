package Lecture.Array.ArrayProblems;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int a[][] = {{3,2,5,6},{9,6,8,7}};
        int b[][] = {{8,9,6,3},{9,8,5,6}};
        int c[][] = new int[a.length][a[1].length];
        for(int i = 0 ;i<2;i++){
            for(int j=0; j<a[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.println(c[i][j]);
            }
        }
    }
}