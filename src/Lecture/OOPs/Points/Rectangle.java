package Lecture.OOPs.Points;

public class Rectangle {
    public int width=0;
    public int height=0;
    public Point origin;
    static final int AGE=55;

    //four constructors

    public Rectangle(Point p){
        origin=p;
    }

    public Rectangle(int w, int h){
        origin=new Point(0,0);
        width=w;
        height=h;
    }
    public Rectangle(Point p,int w,int h){
//        this(p);
        width=w;
        height=h;
        origin=p;
    }
    public void move(int x, int y){
        System.out.println("\nAfter move: ");
        origin.x=x;
        origin.y=y;
    }
    public int getArea(){
        return width*height;
    }
}
