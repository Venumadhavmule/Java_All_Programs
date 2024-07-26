package Lecture.OOPs;

public class EmployeeClone implements Cloneable{
    int id;
    String name;
    EmployeeClone(int id, String name){
        this.id = id;
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class EmployeeClone1 {
    public static void main(String args[]) throws CloneNotSupportedException{
        EmployeeClone e1= new EmployeeClone(588,"Venu");
        e1.setId(10);
        e1.display();
        EmployeeClone e2 = (EmployeeClone) e1.clone();
        e2.display();
        //e2.setId(600);
        //e2.display();
    }
}
