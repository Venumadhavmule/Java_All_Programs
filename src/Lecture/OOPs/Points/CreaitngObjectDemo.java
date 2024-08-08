package Lecture.OOPs.Points;

public class CreaitngObjectDemo {
    public static void main(String[] args) {
        //Creating a point object and 2 objects for Rectangle class
        Point originOne=new Point(23,94);
        Rectangle rectOne=new Rectangle(100,200,originOne);
        Rectangle rectTwo=new Rectangle(50,100);


        // Display rectOne's Width, height,area
        System.out.println("Width of rectOne: "+rectOne.width);
        System.out.println("Height of rectOne: "+rectOne.height);
        System.out.println("Area of rectOne: "+rectOne.getArea());

        //set rectTwo origins position
        rectTwo.origin=originOne;
        //Display recTwo's position
        System.out.println("X position of rectTwo: "+rectTwo.origin.x);
        System.out.println("Y position of rectTwo: "+rectTwo.origin.y);

        //Move its rectTwo to new position
        rectTwo.move(40,72);
        System.out.println("X position of rectTwo: "+rectTwo.origin.x);
        System.out.println("Y position of rectTwo: "+rectTwo.origin.y);
    }
}
