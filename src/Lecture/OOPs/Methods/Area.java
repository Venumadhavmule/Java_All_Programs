package Lecture.OOPs.Methods;

public class Area {
    final double PI=3.146;
    double radius=0;
    double length=0;
    double breadth=0;

    //Updating fields through object
    public void setValues(double radius,double length, double breadth) {
        this.radius = radius;
        this.length=length;
        this.breadth=breadth;
    }

    //Area of various forms
    public void area(){
        System.out.println(areaOfCircle());
        System.out.println(areaOfRectangle());
        System.out.println(areaOfTriangle());
    }


    //Method for Area of Circle
    double areaOfCircle(){
        System.out.print("Area of Circle: ");
        return PI*radius*radius;
    }

    //Method for Area Of Triangle
    double areaOfTriangle(){
        System.out.print("Area of Triangle: ");
        return (0.5)*breadth*breadth;
    }

    //Method for Area of Rectangle
    double areaOfRectangle(){
        System.out.print("Area of Rectangle: ");
        return length*breadth;
    }
}

class Area2 extends Area{
    public static void main(String[] args) {
        Area a=new Area();
        a.setValues(3,4,5);
        a.area();

    }

}

