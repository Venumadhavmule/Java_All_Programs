package RegularExpressions;

import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Number_Validartion {
    public static void main(String args[]){
        Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher("919014602866");
        if(m.find() && m.group().equals(args[0])){
            System.out.println("It is Valid mobile number");
        }else {
            System.out.println("Invalid mobile number");
        }
    }
}
