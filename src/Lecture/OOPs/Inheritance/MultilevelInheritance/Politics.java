package Lecture.OOPs.Inheritance.MultilevelInheritance;

class India{

    India(){
        System.out.println("India constructor is invoked ");
    }
    void Countries(){
        System.out.println("------>>Countries Method in India class");
        System.out.println("UK");
        System.out.println("China");
        System.out.println("Japan");
        System.out.println("England");
    }
}

class Ap extends India{
    Ap(){
        System.out.println("Ap constructor is invoked");
    }
    void states(){
        System.out.println("------>>States Method in States class");
        System.out.println("Jammu Kasmir");
        System.out.println("Bihar");
        System.out.println("Telangana");
        System.out.println("Goa");
    }
}

class Ongole extends Ap{
    Ongole(){
        System.out.println("Ongole Constructor is invoked");
    }
    void district(){
        System.out.println("------>>District Method in District class");
        System.out.println("Kadapa");
        System.out.println("Nellore");
        System.out.println("Guntur");
        System.out.println("Visakapatnam");
    }
    public static void main(String args[]){
        Ongole f=new Ongole();
        f.Countries();
        f.states();
        f.district();
    }
}
