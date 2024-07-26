package Lecture.OOPs.Methods.Instance_Methods_Get_Set;
class GetEg {
    int a=10;
    int b;
    int getAvalue(){
        return a;
    }
}
class GetEg1{
    public static void main(String[] args) {
        GetEg e = new GetEg();
        int a= e.getAvalue();
        System.out.println(a);
    }
}
