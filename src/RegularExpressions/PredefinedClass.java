package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedClass {
    public static void main(String args[]) {
        Pattern p= Pattern.compile("\\W");
        Matcher m = p.matcher("a7b k@9");

        while(m.find()){
            System.out.println(+m.start()+"<.........>"+m.group());
        }
    }
}
