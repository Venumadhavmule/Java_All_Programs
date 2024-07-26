package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String args[]) {
        int count =0 ;
        Pattern p= Pattern.compile("ab");
        Matcher m = p.matcher("ababbaababassbabaaababbaba");

        while(m.find()){
            count++;
            System.out.println(+m.start()+"<.........>"+m.end()+"="+m.group());
        }
        System.out.println("No of matches: "+count);
    }
}
