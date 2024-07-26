package Lecture.Array.ArrayProblems;

public class Missing_Number_1_to_N {
    public static void main(String[] args) {
        int a1[]={1,2,3,5,6,7,8};
        int n = 8;
        //formula for sum of numbers from 1 to N :---------> (n*(n+1))/2
        int totalSum = (8*(8+1))/2;
        int arraySum = 0;
        for(int i=0; i<a1.length ; i++){
            arraySum+=a1[i];
        }
        int missingNumber = totalSum-arraySum;
        System.out.println("Missing Number: "+missingNumber);
    }
}
