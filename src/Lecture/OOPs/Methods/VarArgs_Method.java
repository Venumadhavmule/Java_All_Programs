package Lecture.OOPs.Methods;

// Varargs arugument must be last parameter in method declaration
// its declaration followed by ... 3dots eg:- void movies(String...name){}
public class VarArgs_Method {
    static void movies(int count,String...name){
        System.out.println("Movies Method is invoked");
        System.out.println("no.of Movies :"+count);
        int i=1;
        for(String s:name){

            System.out.println("movie "+i+" = " +s);
            i++;
        }
    }
    public static void main(String[] args) {
        movies(1,"Nani");
        movies(3,"varsham","billa","Salaar");
    }
}
