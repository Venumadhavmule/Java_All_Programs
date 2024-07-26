package Lecture.Array.ArrayProblems;

public class Remove_Duplicate_From_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        // Copy the unique elements back to the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
            
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
