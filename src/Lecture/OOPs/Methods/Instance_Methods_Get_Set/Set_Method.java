package Lecture.OOPs.Methods.Instance_Methods_Get_Set;

class Set_Method {
    int a;
    int b;
    void setAvalue(int a){
        this.a = a;
    }
    void setBvalue(int b){
        this.b = b;
    }
}
class Set_Method1{
    public static void main(String[] args) {
        Set_Method s = new Set_Method();
        s.setAvalue(10);
        s.setBvalue(20);
        System.out.println(s.a);
        System.out.println(s.b);
    }
}
