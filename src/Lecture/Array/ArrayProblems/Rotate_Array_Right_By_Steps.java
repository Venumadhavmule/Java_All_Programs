package Lecture.Array.ArrayProblems;

import java.util.Arrays;

public class Rotate_Array_Right_By_Steps {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int steps=3;
        System.out.println("Before Rotation: ");
        for(int i =0;i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for(int k =0; k<steps; k++){
            int last=a[a.length - 1];
            for(int i = a.length-1 ;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=last;
        }
        System.out.println("After "+steps+" rotate right an array is: ");
        for(int i =0;i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }
}
