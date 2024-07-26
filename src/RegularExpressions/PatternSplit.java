package RegularExpressions;

import  java.util.regex.Pattern;
//Splitting pattern by using Pattern class
public class PatternSplit {
    public static void main(String[] args) {
        Pattern s = Pattern.compile("\\s");
        String[] s1= s.split("Venu Madhav Reddy");
        for(String s2:s1){
            System.out.println(s2);
        }
    }
}
