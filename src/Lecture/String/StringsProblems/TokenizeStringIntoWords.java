package Lecture.String.StringsProblems;

import java.net.SocketAddress;
import java.util.StringTokenizer;

public class TokenizeStringIntoWords {
    public static void main(String[] args) {
        //------------------->>>>>>>>>>Split
        String str1 = "hi,hello,Hyderabad,Thursday";
        String[] tokenArray = str1.split(",");
        for (String s : tokenArray) {
            System.out.println(s);
        }

        //----------------------------->>>>>>>>>StringTokenizer
        StringTokenizer str2 = new StringTokenizer("Morning :6.AM,Afternoon :12.PM,Evening :4.PM",",");
        while (str2.hasMoreTokens()){
            System.out.println(str2.nextToken());
        }
    }
}
