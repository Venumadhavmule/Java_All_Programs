package Lecture.OOPs.Methods;

class MethodDemo{
    int a=10;
    MethodDemo(){
        System.out.println(a);
    }
    MethodDemo(int a){
        a=35;
        //sample();
        display(a);
        System.out.println("a = " + a);
    }
    //called method
    //1.No return type & no parameters
    void sample(){
       int a = 20;
        System.out.println(a);
    }
    void display(int a) {
        System.out.println("display method value: "+a);
    }
    //2.With return type & no parameters
    int sum() {
        int a =10;
        int b= 20;
        int c= a+b;
        return c;
    }
    //3.NO return type & with parameters
    void Movie(String movie, String heroName){
        System.out.println("Movie name: "+movie+"----->>>Hero name : "+heroName);
    }
    //4. Return type & with parameters
    float averageMarks(double sub1, double sub2, double sub3){
        System.out.println("a: "+sub1);
        System.out.println("a: "+sub2);
        System.out.println("a: "+sub3);

        float c= (float)((sub1+sub2+sub3)/3);
        return c;
    }
    double calculateAvgSpeed(double speed1, double speed2, double speed3){
        return (speed1+speed2+speed3)/3;
    }
}
public class MethodExample {
    public static void main(String[] args) {
       MethodDemo obj = new MethodDemo(35);
       //Method calling
       obj.sample();
       obj.display(66);
       int a = obj.sum();
       System.out.println("sum function : " +a);
       obj.Movie("Kalki","Prabhas");
       float b = obj.averageMarks(56,89.6458f,36.59898f);
        System.out.println("Average marks: "+b);
        System.out.println(obj.calculateAvgSpeed(23.56,96.56,65.89));
    }
}
