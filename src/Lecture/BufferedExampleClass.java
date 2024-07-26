package Lecture;
import java.io.*;

public class BufferedExampleClass {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("Enter name of the student: ");
        String name = obj.readLine();
        System.out.println("Enter RollNumber: ");
        int rollNumber = Integer.parseInt(obj.readLine());
        System.out.println("Enter Student Average Marks: ");
        float averageMarks = Float.parseFloat(obj.readLine());
        System.out.println("Enter student PhoneNumber: ");
        double phoneNumber = Double.parseDouble(obj.readLine());
        System.out.println("Enter sec name: ");
        char sec = (char) obj.read();

    }
}
