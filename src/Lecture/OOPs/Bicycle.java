package Lecture.OOPs;

class Bicycle {
    private int cadence;
    private int speed; 
    private int gear;
    private int id;
    static int numberOfBicycles=12;
//    public Bicycle(){
//        System.out.println("Default constructor is invoked");
//        System.out.println(cadence);
//    }
    public Bicycle(int startCadence, int startSpeed,int startGear){
        cadence=startCadence;
        speed=startSpeed;
        gear=startGear;
        id =++numberOfBicycles;
    }
    public int getNumberOfBicycles(){
        return numberOfBicycles;
    }
    public int getCadence(){
        return cadence;
    }
    public void changeCadence(int newValue){
        cadence=newValue;
    }
    int getGear(){
        return gear;
    }
    void changeGear(int newValue){
        gear=newValue;
    }
    int getSpeed(){
        return speed;
    }
    void applyBreaks(int decrement){
        speed=speed-decrement;
    }
    void speedUp(int newValue){
        speed = speed+newValue;
    }
}
class BicycleDemo{
    public static void main(String args[]){
//        Bicycle b= new Bicycle();
        Bicycle b1= new Bicycle(50,60,5);
        System.out.println(b1.numberOfBicycles);
        Bicycle.numberOfBicycles=33;
        Bicycle b2=new Bicycle(30,40,4);
        System.out.println(b2.getNumberOfBicycles());
        System.out.println(b1.getNumberOfBicycles());
        System.out.println(b1.getCadence());
        System.out.println(b1.getSpeed());
        System.out.println(b1.getGear());
        System.out.println("Number of Bicycles :"+b1.getNumberOfBicycles());
        b1.changeCadence(50);
        b1.changeGear(2);
        b1.speedUp(60);
        b1.applyBreaks(20);


        b2.changeCadence(45);
        b2.changeGear(5);
        b2.speedUp(80);
        b2.applyBreaks(30);


    }
}
