package Lecture.OOPs.classs;

class Car{
    String color = "Red";
    int no_of_sets = 4;
    String company = "Ford";
    float price = 450000.039F;
    boolean status = true;
    void display() {
        System.out.println(color);
        System.out.println(no_of_sets);
        System.out.println(company);
        System.out.println(price);
    }

    boolean engineStatus() {
        if(status){
            return status;
        }else {
            return status=false;
        }
    }

}

public class ClassExample {
    String color="Blue";
        public static void main(String args [] ) {
        ClassExample ce1= new ClassExample();
        Car c1 = new Car();
        c1.display();
        System.out.println("engine status: "+c1.engineStatus());

        Car c2 = new Car();
        c2.display();


    }
}
