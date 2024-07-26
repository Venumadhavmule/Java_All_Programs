package Lecture.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExapmle2 {
    public static void main(String[] args){
        int a[] = new int[5];

        //Array initialisation ways
        int arr[];
        arr=new int[5];
        float[] anArrayOfFloat={02.3f,6.6f,9.6f};
        arr[0]=1;
        arr[1]=5;
        arr[2]=9;
        arr[3]=85;
        arr[4]=32;
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        System.out.println(Arrays.toString(copyFrom));
        String[] copyTo=new String[7];
        System.arraycopy(copyFrom,2,copyTo,0,5);
        for(String s:copyTo) {
            System.out.println(s);
        }



        Scanner input = new Scanner(System.in);
        System.out.println("Now Enter values for insert into array:");
        for( int i = 0; i< a.length ; i++) {
            System.out.print("Enter a["+i+"] value: ");
            a[i] = input.nextInt();
        }

        System.out.println("Now display Array values ");
        for( int i = 0; i<a.length ;i++ ) {
            System.out.println("a["+i+"]: "+a[i]);
        }
    }
}
