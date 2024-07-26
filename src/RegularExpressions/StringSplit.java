package RegularExpressions;

//String Splitting by using String Split Method
public class StringSplit {
    public static void main(String args[]){
        String s="Venu Madhav Reddy";
        String[] s1= s.split("\\s");
        for(String s2: s1){
            System.out.println(s2);
        }
    }
}
