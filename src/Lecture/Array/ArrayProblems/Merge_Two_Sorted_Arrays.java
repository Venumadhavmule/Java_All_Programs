package Lecture.Array.ArrayProblems;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int a[] = {10,50,90,60,10,20,30};
        int b[] = {60,50,90,20,30,70};
        int c[]=new int[a.length+b.length];
        Arrays.sort(a);
        Arrays.sort(b);
        int ni = 0;
        for(int i =0 ; i<a.length ; i++){
            c[ni] = a[i];
            ni++;
        }
        for(int j =0;j<b.length;j++){
            c[ni]=b[j];
            ni++;
        }
        Arrays.sort(c);
        for(int i=0 ; i<c.length ;i++){
            System.out.print(c[i]+" ");
        }

    }
}
