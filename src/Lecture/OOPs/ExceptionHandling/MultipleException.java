package Lecture.OOPs.ExceptionHandling;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class MultipleException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.print("Enter a value: ");
            int a=s.nextInt();
            if(100%a ==0)
                System.out.print("factor of a ");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block & out of main method");
        }
    }
}
