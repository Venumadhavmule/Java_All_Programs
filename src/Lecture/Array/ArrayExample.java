package Lecture.Array;

class ArrayExample{
    public static void main(String[]args){
        System.out.println("Array accessing");
        int a[] = {10,15,96,6,33,68};
        for(int i=0; i<a.length ; i++) {
            System.out.println("a["+i+"] : "+a[i]);
        }
        System.out.println("Array intialising and assigning values");
        int b[] = new int[5];
        b[0]=1;
        b[1]=3;
        b[2]= 4;
        for(int i=0; i<b.length ; i++) {
            System.out.println("b["+i+"] : "+b[i]);
        }
    }
}

