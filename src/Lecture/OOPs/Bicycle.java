package Lecture.OOPs;

class Bicycle {
    private int cadence;
    private int speed; 
    private int gear;
    public Bicycle(){
        System.out.println(cadence);
    }
    public Bicycle(int startCadence, int startSpeed,int startGear){
        cadence=startCadence;
        speed=startSpeed;
        gear=startGear;
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
        Bicycle b= new Bicycle();
        Bicycle b1= new Bicycle(50,60,5);
        Bicycle b2=new Bicycle(30,40,4);
        System.out.println(b1.getCadence());
        System.out.println(b1.getSpeed());
        System.out.println(b1.getGear());
//        b1.changeCadence(50);
//        b1.changeGear(2);
//        b1.speedUp(60);
//        b1.applyBreaks(20);
//        b1.printStates();
//
//
//        b2.changeCadence(45);
//        b2.changeGear(5);
//        b2.speedUp(80);
//        b2.applyBreaks(30);
//        b2.printStates();

    }
}
