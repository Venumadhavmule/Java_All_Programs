package Lecture.OOPs.Inheritance.SingleInheritance;

class Bank {
    long amount;
    float interest;
    Bank(){
        System.out.println("Bank Constructor is invoked");
        System.out.println(amount);
        System.out.println(interest);
    }
    public void setValues(long amount, float interest) {
        this.amount = amount;
        this.interest = interest;
    }
    void display(){
        System.out.println(amount);
        System.out.println(interest);
    }
}
class Customer extends Bank{
    int c1=(int)super.amount;
    float interest= super.interest;
    Customer(){
        System.out.println("Customer constructor invoked");
    }
    public static void main(String args[]){
        Customer c1= new Customer();
        c1.setValues(16000,6.36f);
        c1.display();
        c1.setValues(96545,96.54f);
        c1.display();

    }
}
