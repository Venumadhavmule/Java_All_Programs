package Lecture.Array.ArrayProblems;

public class Pairs_Sum_To_Target {
    public static void main(String[] args) {
        int arr[] = {2,6,4,3,1,-1};
        int target = 5;
        int count =0;
        for(int i =0; i<arr.length;i++) {
            for(int j=i+1 ; j<arr.length;j++){
                if(arr[i]+arr[j] == target) {
                    System.out.println("a["+i+"]+a["+j+"]");
                    count++;
                }
            }
        }
        System.out.println("total sum reached target count is: "+count);

    }
}
