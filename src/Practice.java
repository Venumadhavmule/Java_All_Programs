import java.io.*;
import java.util.Scanner;
public class Practice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Sort the array in descending order
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            int sum = 0;
            for (int i = 0; i < n / 2; i++) {
                sum = sum + (arr[i] - arr[n - i - 1]);
            }

            System.out.println(sum);
        }
    }