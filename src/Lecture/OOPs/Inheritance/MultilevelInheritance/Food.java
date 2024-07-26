package Lecture.OOPs.Inheritance.MultilevelInheritance;

public class Food {
    String foodType="Veg";
    String iceCream="Vanilla";
    String food="Idli";
    void display(){
        System.out.println(foodType);
        System.out.println(iceCream);
        System.out.println(food);
    }
}
class Veg extends Food{
    void setData(String foodType,String iceCream,String food){

        foodType=super.foodType;
        System.out.println(foodType);
        super.iceCream=iceCream;
        super.food=food;

    }
}
class NonVeg extends Veg{
    void display2(){
        super.display();
    }

    public static void main(String[] args) {

        NonVeg n=new NonVeg();
        n.setData("NonVeg","Strawberry","Idli& Chicken");
        n.display2();


    }
}
