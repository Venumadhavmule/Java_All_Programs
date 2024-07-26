package Lecture.Array.ArrayProblems;

public class Missing_Numbersss_From_1_to_N {
    public static void main(String[] args) {
        int a[]={2,5,6,8,9};

        for(int i =1; i<=9;i++) {
            boolean found = false;
            for(int num:a) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(i+" ");
            }
        }
    }
}
